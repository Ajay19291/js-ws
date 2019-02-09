package com.jandarbar.ws.resources;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jandarbar.ws.entities.Assemblyconstituency;
import com.jandarbar.ws.services.AssemblyconstituencyService;

@CrossOrigin(origins = "http://localhost:8090", maxAge = 3600)
@RestController
@RequestMapping(path="/assembly")
public class AssemblyConstituencyResource 
{
	@Autowired
	private AssemblyconstituencyService assemblyconstituencyService;
	
	@RequestMapping(path="/getAll")
	public List<Assemblyconstituency> getAllAssembly()
	{
		return assemblyconstituencyService.getAll();
	}
	
	public Assemblyconstituency createAssemblyconstituency(HttpServletRequest request)
	{
		return assemblyconstituencyService.create(request);
	}
	
	@RequestMapping(path="/get/{id}")
	public Assemblyconstituency getAssemblyconstituencyById(@PathVariable(value = "id") Long id)
	{
		return assemblyconstituencyService.getById(id);
	}
}
