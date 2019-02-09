package com.jandarbar.ws.repositories;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.jandarbar.ws.entities.CandidatePosts;

@Repository
public interface CandidatePostsRepository extends PagingAndSortingRepository<CandidatePosts, Long>//JpaRepository<CandidatePosts, Long>
{

	public List<CandidatePosts> findByFkcandidateIdOrderByPublishDateDesc(Long fkcandidateId);

	@Query("Select cp,ci from CandidatePosts as cp, CandidateInfo as ci Where cp.fkcandidateId = ci.pkcandidateid and ci.type=:type Order By cp.id desc")
	public List<Object[]> findByTypeOrderByPublishDateDesc(@Param("type") String type,Pageable pageable);
}
