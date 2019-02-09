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

import com.jandarbar.ws.entities.CandidatePosts;
import com.jandarbar.ws.services.CandidatePostsService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping(path="/candidateposts")
public class CanadidatePostsResource 
{
	@Autowired
	private CandidatePostsService candidatePostsService;
	
	@RequestMapping("/save/{candidateId}")
	public CandidatePosts savePost(@PathVariable(value="candidateId" ,required = false) Long candidateId, @RequestParam(value="imageMedia",required = false) MultipartFile imageFile,@RequestParam(value="videoMedia",required = false) MultipartFile videoFile,HttpServletRequest request )
	{
		return candidatePostsService.create(candidateId,imageFile,videoFile,request);
	}
	
	@RequestMapping("/getPostByCandidate/{candidateId}")
	public List<CandidatePosts> getByCandidate(@PathVariable("candidateId") Long candidateId)
	{
		return candidatePostsService.getByCandidateId(candidateId);
	}
	
	@RequestMapping("/{type}/{from}/{to}")
	public List<Object[]> getByCandidate(@PathVariable("type") String type,@PathVariable("from") Long from,@PathVariable("to") Long to)
	{
		return candidatePostsService.getByType(type,from,to);
	}

}
