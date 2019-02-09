package com.jandarbar.ws.resources;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jandarbar.ws.entities.QuestionMaster;
import com.jandarbar.ws.services.QuestionMasterService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping(path="/question/master")
public class QuestionMasterResource 
{
	@Autowired
	private QuestionMasterService questionMasterService;
	
	@RequestMapping(path="/getAll")
	public List<QuestionMaster> getAllQuestionMaster()
	{
		return questionMasterService.getAll();
	}
	
	@RequestMapping(path="/create")
	public QuestionMaster createQuestionMaster(HttpServletRequest request)
	{
		return questionMasterService.create(request);
	}
	
	@RequestMapping(path="/get/{id}")
	public QuestionMaster getQuestionMasterById(@PathVariable(value="id")Long id)
	{
		return questionMasterService.getById(id);
	}
}
