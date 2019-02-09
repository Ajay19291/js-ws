package com.jandarbar.ws.resources;

import java.math.BigInteger;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.jandarbar.ws.entities.CandidateInfo;
import com.jandarbar.ws.services.CandidateService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping(path="/candidate")
public class CandidateResource 
{
	@Autowired
	private CandidateService candidateService;
	
	@RequestMapping(path="getAll")
	public List<CandidateInfo> getAll()
	{
		return candidateService.getAll();
	}
	
	@RequestMapping(path="/create")
	public CandidateInfo createCandidateInfo(@RequestParam("logo") MultipartFile file,HttpServletRequest request)
	{
		return candidateService.createCandidateInfo(file,request);
	}
	
	@RequestMapping(path="/update/{candidateId}")
	public  CandidateInfo updateCandidateInfo(@RequestParam(value ="pphoto",required=false) MultipartFile file,HttpServletRequest request,@PathVariable("candidateId") Long candidateId)
	{
		return candidateService.updateCandidateInfo(file,request,candidateId);
	}
	
	@RequestMapping("/get/{id}")
	public CandidateInfo getById(@PathVariable("id")Long id)
	{
		return candidateService.getById(id);
	}
	
	@RequestMapping("/search/{searchStr}")
	public List<CandidateInfo> getBySearchString(@PathVariable("searchStr")String searchStr)
	{
		return candidateService.searchCandidate(searchStr, searchStr);
	}
}
