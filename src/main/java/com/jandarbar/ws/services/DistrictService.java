package com.jandarbar.ws.services;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import com.jandarbar.ws.entities.DistrictMaster;
import com.jandarbar.ws.repositories.DistrictRepository;

@Service
public class DistrictService extends GenericServiceImpl<DistrictMaster>
{

	@Autowired
	private DistrictRepository districtRepository;
	
	public DistrictMaster createDistrict(HttpServletRequest request) {
		String districtName = request.getParameter("name");
		String stateId = request.getParameter("stateId");
		
		DistrictMaster districtMaster = new DistrictMaster();
		districtMaster.setDistrictname(districtName);
		districtMaster.setFkstateid(new BigInteger(stateId));
		districtMaster.setIsactive("Y");
		districtMaster.setCreatedby(new BigInteger("10000"));
		districtMaster.setCreateddate(new Date());
		districtRepository.save(districtMaster);
		return districtMaster;
	}

	public List<DistrictMaster> getDistrictsByState(BigInteger id) {
		DistrictMaster districtMaster = new DistrictMaster();
		districtMaster.setFkstateid(id);
		districtMaster.setIsactive("Y");
		
		
		return districtRepository.findAll(Example.of(districtMaster));
	}

}
