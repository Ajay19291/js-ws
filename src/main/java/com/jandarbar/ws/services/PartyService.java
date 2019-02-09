package com.jandarbar.ws.services;

import java.math.BigInteger;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.multipart.MultipartFile;

import com.jandarbar.ws.entities.PartyMaster;
import com.jandarbar.ws.repositories.PartyRespository;

@Service
public class PartyService extends GenericServiceImpl<PartyMaster>
{
	@Autowired
	private PartyRespository partyRespository;
	
	@Autowired
    private FileStorageService fileStorageService;
	
	@SuppressWarnings("deprecation")
	public PartyMaster createParty(MultipartFile file, HttpServletRequest request) {
		String fileName = StringUtils.cleanPath(file.getOriginalFilename());
		fileStorageService.storeFile(file,fileName);
		
		PartyMaster partyMaster = new PartyMaster();
		partyMaster.setPartyname(request.getParameter("name"));
		partyMaster.setPartydesc(request.getParameter("description"));
		partyMaster.setVision(request.getParameter("vision"));
		partyMaster.setMission(request.getParameter("mision"));
		partyMaster.setEstablishdate(new Date(request.getParameter("estDate")));
		partyMaster.setPartylogo(fileName);
		partyMaster.setIsactive("Y");
		partyMaster.setCreatedby(new BigInteger("10000"));
		partyMaster.setCreateddate(new Date());
		
		
		partyRespository.save(partyMaster);
		return partyMaster;
	}

}
