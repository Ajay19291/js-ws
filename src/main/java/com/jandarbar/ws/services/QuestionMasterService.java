package com.jandarbar.ws.services;

import java.math.BigInteger;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import com.jandarbar.ws.entities.QuestionMaster;

@Service
public class QuestionMasterService extends GenericServiceImpl<QuestionMaster>
{

	public QuestionMaster create(HttpServletRequest request) {
		QuestionMaster questionMaster = new QuestionMaster();
		questionMaster.setQuestion(request.getParameter("questionstr"));
		questionMaster.setFkquestioncategoryid(new BigInteger(request.getParameter("questionCatId")));
		
		questionMaster.setIsactive("Y");
		questionMaster.setCreatedby(new BigInteger("100000"));
		questionMaster.setCreateddate(new Date());
		
		return save(questionMaster);
	}

}
