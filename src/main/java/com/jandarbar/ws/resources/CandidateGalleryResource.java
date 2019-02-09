package com.jandarbar.ws.resources;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.jandarbar.ws.entities.CandidateGallery;
import com.jandarbar.ws.services.CandidateGalleryService;

@RestController
@RequestMapping(path="/candidateGallery")
@CrossOrigin(origins = "*", maxAge = 3600)
public class CandidateGalleryResource 
{
	@Autowired
	private CandidateGalleryService candidateGalleryService;
	
	@RequestMapping("/save/{candidateId}")
	public CandidateGallery savePost(@PathVariable(value="candidateId" ,required = false) Long candidateId, @RequestParam(value="imageMedia",required = false) MultipartFile imageFile,@RequestParam(value="videoMedia",required = false) MultipartFile videoFile,HttpServletRequest request )
	{
		return candidateGalleryService.create(candidateId,imageFile,videoFile,request);
	}
	
	@RequestMapping("/getByCandidate/{candidateId}")
	public List<CandidateGallery> getByCandidateId(@PathVariable(value="candidateId") Long candidateId)
	{
		return candidateGalleryService.getGalleryByCandidate(candidateId);
	}
	
	@RequestMapping("/getByCandidate/{candidateId}/{type}")
	public List<CandidateGallery> getByCandidateId(@PathVariable(value="candidateId") Long candidateId,@PathVariable("type") String type)
	{
		return candidateGalleryService.getGalleryByCandidateAndType(candidateId,type);
	}

}
