package com.jandarbar.ws.services;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.jandarbar.ws.entities.CandidateInfo;
import com.jandarbar.ws.repositories.CandidateRepository;

@Service
public class CandidateService extends GenericServiceImpl<CandidateInfo>
{
	@Autowired
	private CandidateRepository candidateRepository;
	
	@Autowired
    private FileStorageService fileStorageService;
	
	@SuppressWarnings("deprecation")
	public CandidateInfo createCandidateInfo(MultipartFile file, HttpServletRequest request) {
		String fileName = "cp-"+StringUtils.cleanPath(file.getOriginalFilename());
		fileStorageService.storeFile(file,fileName);
		
		CandidateInfo candidateInfo = new CandidateInfo();
		candidateInfo.setFirstname(request.getParameter("fname"));
		candidateInfo.setMiddlename(request.getParameter("mname"));
		candidateInfo.setLastname(request.getParameter("lname"));
		candidateInfo.setGender(request.getParameter("gender"));
		candidateInfo.setDateofbirth(new  Date(request.getParameter("dob")));
		//candidateInfo.setFkuserid(fkuserid);
		candidateInfo.setNoofcriminalcases(Integer.parseInt(request.getParameter("noofcriminalcases")));
		candidateInfo.setQuestionanswermedium(request.getParameter("questionansmedium"));
		candidateInfo.setProfilephoto(fileName);
		candidateInfo.setFkassemblyconstituencyid(new BigInteger(request.getParameter("assemblyConstId")));
		candidateInfo.setFkparliamentryconstituencyid(new BigInteger(request.getParameter("parliamentaryConstId")));
		candidateInfo.setFkdistrictid(new BigInteger(request.getParameter("districtId")));
		candidateInfo.setAddress(request.getParameter("addresss"));
		candidateInfo.setEmailid(request.getParameter("emailId"));
		
		candidateInfo.setContactno(request.getParameter("contactno"));
		candidateInfo.setIsactive("Y");
		candidateInfo.setCreatedby(new BigInteger("10000"));
		candidateInfo.setCreateddate(new Date());
		
		
		return candidateRepository.save(candidateInfo);
	}

	public CandidateInfo updateCandidateInfo(MultipartFile file, HttpServletRequest request, Long candidateId)
	{
		CandidateInfo candidateInfo = getById(candidateId);
		if(candidateInfo != null)
		{
			candidateInfo.setFirstname(request.getParameter("fname"));
			candidateInfo.setMiddlename(request.getParameter("mname"));
			candidateInfo.setLastname(request.getParameter("lname"));
			candidateInfo.setGender(request.getParameter("gender"));
			candidateInfo.setAddress(request.getParameter("address"));
			candidateInfo.setDateofbirth(new Date(request.getParameter("dob").replaceAll("-", "//")));
			candidateInfo.setFkdistrictid(new BigInteger(request.getParameter("district")));
			
			if(file != null)
			{
				String fileName = "cp-"+StringUtils.cleanPath(file.getOriginalFilename());
				fileStorageService.storeFile(file,fileName);
				candidateInfo.setProfilephoto(fileName);
			}
			
			save(candidateInfo);
		}
		
		return candidateInfo;
	}
	
	public List<CandidateInfo> searchCandidate(String firstname, String lastname)
	{
		return candidateRepository.findByFirstnameStartingWithOrLastnameStartingWith(firstname, lastname);
	}

}
