package com.jandarbar.ws.services;

import java.math.BigInteger;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import com.jandarbar.ws.entities.Assemblyconstituency;

@Service
public class AssemblyconstituencyService extends GenericServiceImpl<Assemblyconstituency>
{

	public Assemblyconstituency create(HttpServletRequest request) 
	{
		Assemblyconstituency assemblyconstituency = new Assemblyconstituency();
		assemblyconstituency.setAssemblyconstituencyname(request.getParameter(""));
		assemblyconstituency.setFkstateid(new BigInteger(request.getParameter("stateId")));
		assemblyconstituency.setFkdistrictid(new BigInteger(request.getParameter("districtId")));
		assemblyconstituency.setFkparliamentryconstituencyid(new BigInteger(request.getParameter("parliamentaryConstId")));
		assemblyconstituency.setSequenceno(new Integer(request.getParameter("")));
		assemblyconstituency.setIsactive("Y");
		assemblyconstituency.setCreatedby(new BigInteger("100000"));
		assemblyconstituency.setCreateddate(new Date());
		save(assemblyconstituency);
		return assemblyconstituency;
	}

}
