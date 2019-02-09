package com.jandarbar.ws.repositories;

import java.math.BigInteger;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jandarbar.ws.entities.QuestionAnswer;

@Repository
public interface QuestionAnswersRepository extends JpaRepository<QuestionAnswer , Long>
{
	public List<QuestionAnswer> findByFkquestionid(BigInteger fkquestionid);
}
