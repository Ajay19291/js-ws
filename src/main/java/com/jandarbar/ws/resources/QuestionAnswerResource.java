package com.jandarbar.ws.resources;

import java.math.BigInteger;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jandarbar.ws.entities.QuestionAnswer;
import com.jandarbar.ws.services.QuestionAnswersService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping(path="/question/answer")
public class QuestionAnswerResource 
{
	@Autowired
	private QuestionAnswersService questionAnswersService;
	
	@RequestMapping(path="/getAll")
	public List<QuestionAnswer> getAllQuestionAnswer()
	{
		return questionAnswersService.getAll();
	}
	
	@RequestMapping(path="/create")
	public QuestionAnswer createQuestionAnswer(HttpServletRequest request)
	{
		return questionAnswersService.create(request);
	}
	
	@RequestMapping(path="/get/{id}")
	public QuestionAnswer getQuestionAnswerbyId(@PathVariable(value="id") Long id)
	{
		return questionAnswersService.getById(id);
	}
	@RequestMapping(path="/getByQuestion/{id}")
	public List<QuestionAnswer> getQuestionAnswerbyQuestionId(@PathVariable(value="id") BigInteger id)
	{
		return questionAnswersService.findQuestionAnswerByQuestionId(id);
	}
}
