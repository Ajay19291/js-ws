package com.jandarbar.ws.resources;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jandarbar.ws.entities.QuestionCategory;
import com.jandarbar.ws.services.QuestionCategoryService;

@CrossOrigin(origins = "http://localhost:8090", maxAge = 3600)
@RestController
@RequestMapping(path="/question/category")
public class QuestionCategoryResource 
{
	@Autowired
	private QuestionCategoryService questionCategoryService;
	
	@RequestMapping(path="/getAll")
	public List<QuestionCategory> getAllQuestionCategory()
	{
		return questionCategoryService.getAll();
	}
	
	@RequestMapping(path="/create")
	public QuestionCategory createQuestionCategory(HttpServletRequest request)
	{
		return questionCategoryService.create(request);
	}
	
	@RequestMapping(path="/get/{id}")
	public QuestionCategory getQuestionCategorybyid(@PathVariable(value="id") Long id)
	{
		return questionCategoryService.getById(id);
	}
}
