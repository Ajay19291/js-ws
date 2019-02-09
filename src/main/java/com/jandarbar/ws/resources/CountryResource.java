package com.jandarbar.ws.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jandarbar.ws.entities.CountryMaster;
import com.jandarbar.ws.services.CountryService;

@CrossOrigin(origins = "http://localhost:8090", maxAge = 3600)
@RestController
@RequestMapping(path="/country")
public class CountryResource 
{
	@Autowired
	private CountryService countryService;
	
	 @RequestMapping("/getAll")
	public List<CountryMaster> getAllCountries() {
	    return countryService.getAll();
	}
	 
	@GetMapping("/get/{id}")
	public CountryMaster getCountryById(@PathVariable(value = "id") Long countryId)
	{  
		return countryService.getById(countryId);
	}
}
