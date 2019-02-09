package com.jandarbar.ws.resources;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jandarbar.ws.entities.StateMaster;
import com.jandarbar.ws.services.StateService;

@CrossOrigin(origins = "*", maxAge = 3600)

@RestController
@RequestMapping(path="/state")
public class StateResource 
{
	@Autowired
	private StateService stateService;
	
	@RequestMapping(path="/getAll")
	public List<StateMaster> getAllStateMasters()
	{
		return stateService.getAll();
	}

	@RequestMapping(path="/create")
	public StateMaster createStateMaster(HttpServletRequest request)
	{
		return stateService.create(request);
	}
	
	@RequestMapping(path="/get/{id}")
	public StateMaster getStateMasterByid(@PathVariable(value="id")Long id)
	{
		return stateService.getById(id);
	}
	
}
