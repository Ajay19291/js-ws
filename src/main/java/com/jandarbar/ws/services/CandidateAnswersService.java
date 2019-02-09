package com.jandarbar.ws.services;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jandarbar.ws.entities.CandidateAnswer;
import com.jandarbar.ws.repositories.CandidateAnswersRepository;

@Service
public class CandidateAnswersService extends GenericServiceImpl<CandidateAnswer>
{
	@Autowired
	private CandidateAnswersRepository candidateAnswersRepository;
	
	public List<CandidateAnswer> getByCandidateId(BigInteger id)
	{
		return candidateAnswersRepository.findByFkcandidateid(id);
	}

	public boolean updateCandidateAnswer(HttpServletRequest request) {
		String candidateId = request.getParameter("id");
		String anserId = request.getParameter("anserId");
		String questionId = request.getParameter("questionId");
		
		try {
		CandidateAnswer candidateAnswer = candidateAnswersRepository.findByFkcandidateidAndFkquestionid(new BigInteger(candidateId), new BigInteger(questionId));
		if(candidateAnswer != null)
		{	
			candidateAnswer.setFkanswerid(new BigInteger(anserId));
			update(candidateAnswer);
		}
		else
		{
			candidateAnswer = new CandidateAnswer();
			candidateAnswer.setFkcandidateid(new BigInteger(candidateId));
			candidateAnswer.setFkanswerid(new BigInteger(anserId));
			candidateAnswer.setFkquestionid(new BigInteger(questionId));
			candidateAnswer.setIsdeleted("N");
			candidateAnswer.setIsactive("Y");
			candidateAnswer.setCreatedby(new BigInteger("10000"));
			candidateAnswer.setCreateddate(new Date());
			save(candidateAnswer);
		}
		return true;
		}
		catch(Exception e)
		{
			return false;
		}
	}

}
