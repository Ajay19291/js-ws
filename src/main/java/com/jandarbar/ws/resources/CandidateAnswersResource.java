package com.jandarbar.ws.resources;

import java.math.BigInteger;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jandarbar.ws.entities.CandidateAnswer;
import com.jandarbar.ws.services.CandidateAnswersService;


@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping(path="/candidateAnswers")
public class CandidateAnswersResource 
{
	@Autowired
	private CandidateAnswersService candidateAnswerService;
	
	@RequestMapping(path="getAll")
	public List<CandidateAnswer> getAll()
	{
		return candidateAnswerService.getAll();
	}
	
	@RequestMapping(path="/get/{id}")
	public List<CandidateAnswer> getByCandidateId(@PathVariable BigInteger id)
	{
		return candidateAnswerService.getByCandidateId(id);
	}
	
	@PostMapping(path="update")
	public boolean updateCandidateAnswer(HttpServletRequest request)
	{
		return candidateAnswerService.updateCandidateAnswer(request);
	}
	
}
