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

import com.jandarbar.ws.entities.DistrictMaster;
import com.jandarbar.ws.services.DistrictService;

@CrossOrigin(origins = "*", maxAge = 3600)

@RestController
@RequestMapping(path="/district")
public class DistrictResource 
{
	@Autowired
	private DistrictService districtService;
	
	@PostMapping(path="/getAll")
	public List<DistrictMaster> getAllDistricts()
	{
		return districtService.getAll();
	}
	
	@RequestMapping(path="/getByState/{id}")
	public List<DistrictMaster> getDistrictsByState(@PathVariable(value="id") BigInteger id)
	{
		
		return districtService.getDistrictsByState(id);
	}
	
	@PostMapping(path="/create")
	public DistrictMaster createDistrict(HttpServletRequest request)
	{
		return districtService.createDistrict(request);
	}
	
	@RequestMapping(path="/get/{id}")
	public DistrictMaster getDistrictsById(@PathVariable(value="id") Long id)
	{
		
		return districtService.getById(id);
	}

}
