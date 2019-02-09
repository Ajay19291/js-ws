package com.jandarbar.ws.services;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.jandarbar.ws.entities.CandidatePosts;
import com.jandarbar.ws.repositories.CandidatePostsRepository;

@Service
public class CandidatePostsService //extends GenericServiceImpl<CandidatePosts>
{
	@Autowired
	private FileStorageService fileStorageService;
	
	@Autowired 
	private CandidatePostsRepository candidatePostsRepository;
	
	public CandidatePosts create(Long candidateId, MultipartFile imageFile, MultipartFile videoFile, HttpServletRequest request) 
	{
		
		CandidatePosts candidatePosts = new CandidatePosts();
		candidatePosts.setFkcandidateId(candidateId);
		candidatePosts.setPublishDate(new Date());
		candidatePosts.setPostContent(request.getParameter("postContent"));
		String mediaOption = request.getParameter("mediaOption");
		if("I".equals(mediaOption))
		{
			String fileName = StringUtils.cleanPath(imageFile.getOriginalFilename());
			fileStorageService.storeFile(imageFile,fileName);
			candidatePosts.setPostImageName(fileName);
		}
		else if("V".equals(mediaOption))
		{
			String fileName = StringUtils.cleanPath(videoFile.getOriginalFilename());
			fileStorageService.storeFile(videoFile,fileName);
			candidatePosts.setPostVideoName(fileName);
		}
		else if("Y".equals(mediaOption))
		{
			candidatePosts.setYoutubeVideoLink(request.getParameter("linkContent"));
		}
		
		candidatePostsRepository.save(candidatePosts);
		
		return candidatePosts;
	}

	public List<CandidatePosts> getByCandidateId(Long candidateId) {
		
		return candidatePostsRepository.findByFkcandidateIdOrderByPublishDateDesc(candidateId);
	}
	
	public List<Object[]> getByType(String type, Long from, Long to) {
		
		Pageable pageable = new PageRequest(from.intValue(), to.intValue(), new Sort(Sort.Direction.DESC, "candidatePostId"));
		return candidatePostsRepository.findByTypeOrderByPublishDateDesc(type,pageable);
	}

}
