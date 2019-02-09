package com.jandarbar.ws.services;

import java.math.BigInteger;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;
import com.jandarbar.ws.entities.Parliamentryconstituency;

@Service
public class ParliamentryconstituencyService extends GenericServiceImpl<Parliamentryconstituency>
{

	public Parliamentryconstituency create(HttpServletRequest request) {

		Parliamentryconstituency parliamentryconstituency = new Parliamentryconstituency();
		parliamentryconstituency.setParliamentryconstituencyname(request.getParameter("name"));
		parliamentryconstituency.setDescription(request.getParameter("description"));
		parliamentryconstituency.setFkdistrictid(new BigInteger(request.getParameter("districtId")));
		parliamentryconstituency.setSequenceno(Integer.parseInt(request.getParameter("sequenceno")));
		parliamentryconstituency.setFkstateid(new BigInteger(request.getParameter("stateId")));
		
		parliamentryconstituency.setIsactive("Y");
		parliamentryconstituency.setCreateddate(new Date());
		parliamentryconstituency.setCreatedby(new BigInteger("100000"));
		save(parliamentryconstituency);
		return parliamentryconstituency;
	}

}
