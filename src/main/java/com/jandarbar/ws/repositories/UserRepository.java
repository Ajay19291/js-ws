package com.jandarbar.ws.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jandarbar.ws.entities.UserInfo;

@Repository
public interface UserRepository extends JpaRepository<UserInfo, Long>
{
	@Query("Select u from UserInfo u where u.emailid=:username and u.password=:password and u.type='A'")
	public List<UserInfo> isValidUser(@Param("username") String username, @Param("password") String password);
	
	public UserInfo findByEmailidAndPasswordAndType(String emailid,String password,String type);
	
	
	@Query("Select u.type,c.fkuserid from UserInfo u, CandidateInfo as c where u.emailid=:username and u.type='A' and c.fkuserid = u.pkuserid")
	public Object[] getUserDetails(@Param("username") String username);
	
}
