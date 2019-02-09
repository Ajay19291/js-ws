package com.jandarbar.ws.repositories;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jandarbar.ws.entities.CandidateAnswer;

@Repository
public interface CandidateAnswersRepository extends JpaRepository<CandidateAnswer, Long>
{
	public List<CandidateAnswer> findByFkcandidateid(BigInteger fkcandidateid);
	
	public CandidateAnswer findByFkcandidateidAndFkquestionid(BigInteger fkcandidateid,BigInteger fkquestionid);
}
