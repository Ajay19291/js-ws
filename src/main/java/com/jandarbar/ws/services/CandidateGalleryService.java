package com.jandarbar.ws.services;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.jandarbar.ws.entities.CandidateGallery;
import com.jandarbar.ws.repositories.CandidateGalleryRepository;

@Service
public class CandidateGalleryService extends GenericServiceImpl<CandidateGallery>
{
	@Autowired
	private FileStorageService fileStorageService;
	
	@Autowired
	private CandidateGalleryRepository candidateGalleryRepository;
	
	public CandidateGallery create(Long candidateId, MultipartFile imageFile, MultipartFile videoFile, HttpServletRequest request) 
	{
		CandidateGallery candidateGallery = new CandidateGallery();
		candidateGallery.setFkCandidateId(candidateId);
		candidateGallery.setCreatedDate(new Date());
		String mediaOption = request.getParameter("mediaOption");
		candidateGallery.setMediaOption(mediaOption);
		if("I".equals(mediaOption))
		{
			String fileName = StringUtils.cleanPath(imageFile.getOriginalFilename());
			fileStorageService.storeFile(imageFile,fileName);
			candidateGallery.setImageName(fileName);
		}
		else if("V".equals(mediaOption))
		{
			String fileName = StringUtils.cleanPath(videoFile.getOriginalFilename());
			fileStorageService.storeFile(videoFile,fileName);
			candidateGallery.setVideoName(fileName);
		}
		save(candidateGallery);
		return candidateGallery;
	}
	
	public List<CandidateGallery> getGalleryByCandidate(Long candidateId)
	{
		return candidateGalleryRepository.findByFkCandidateId(candidateId);
	}

	public List<CandidateGallery> getGalleryByCandidateAndType(Long candidateId, String mediaOption) 
	{
		return candidateGalleryRepository.findByFkCandidateIdAndMediaOption(candidateId,mediaOption);
	}
}
