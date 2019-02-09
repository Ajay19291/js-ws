package com.jandarbar.ws.resources;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.jandarbar.ws.entities.PartyMaster;
import com.jandarbar.ws.services.PartyService;


@CrossOrigin(origins = "http://localhost:8090", maxAge = 3600)
@RestController
@RequestMapping(path="/party")
public class PartyResource 
{
	@Autowired
	PartyService partyService;
	
	@PostMapping("/create")
	public PartyMaster createParty(@RequestParam("logo") MultipartFile file,HttpServletRequest request ) 
	{		
	    return partyService.createParty(file,request);
	}
	
	@PostMapping(value="/getAll")
	public List<PartyMaster> getAllParties() {
		return partyService.getAll();
	}
	
}
