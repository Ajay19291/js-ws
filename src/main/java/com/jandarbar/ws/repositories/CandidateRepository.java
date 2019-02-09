package com.jandarbar.ws.repositories;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jandarbar.ws.entities.CandidateInfo;


@Repository
public interface CandidateRepository extends JpaRepository<CandidateInfo, Long>
{
	public CandidateInfo findByFkuserid(BigInteger userId);
	
	public CandidateInfo findByEmailidAndPasswordAndType(String emailid,String password,String type);
	
	public CandidateInfo findByEmailidAndPassword(String emailid,String password);
	
	public List<CandidateInfo> findByFirstnameStartingWithOrLastnameStartingWith(String firstname,String lastname);
	
	
	
}
