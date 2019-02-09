package com.jandarbar.ws.resources;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jandarbar.ws.entities.Parliamentryconstituency;
import com.jandarbar.ws.services.ParliamentryconstituencyService;

@CrossOrigin(origins = "http://localhost:8090", maxAge = 3600)
@RestController
@RequestMapping(path="/parliamentary")
public class ParliamentryconstituencyResource 
{
	@Autowired
	private ParliamentryconstituencyService parliamentryconstituencyService;
	
	@RequestMapping(path="/getAll")
	public List<Parliamentryconstituency> getAllParliamentryconstituency()
	{
		return parliamentryconstituencyService.getAll();
	}
	
	@RequestMapping(path="/create")
	public Parliamentryconstituency createParliamentryconstituency(HttpServletRequest request)
	{
		return parliamentryconstituencyService.create(request);
	}
	
	@RequestMapping(path="/get/{id}")
	public Parliamentryconstituency getParliamentryconstituencyById(@PathVariable(value="id") Long id)
	{
		return parliamentryconstituencyService.getById(id);
	}
}
