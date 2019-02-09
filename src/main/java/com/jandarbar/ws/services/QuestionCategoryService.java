package com.jandarbar.ws.services;

import java.math.BigInteger;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import com.jandarbar.ws.entities.QuestionCategory;

@Service
public class QuestionCategoryService extends GenericServiceImpl<QuestionCategory>
{

	public QuestionCategory create(HttpServletRequest request) {
		QuestionCategory questionCategory = new QuestionCategory();
		questionCategory.setCategoryname(request.getParameter("name"));
		questionCategory.setCategorydescription(request.getParameter("description"));
		
		questionCategory.setIsactive("Y");
		questionCategory.setCreatedby(new BigInteger("10000"));
		questionCategory.setCreateddate(new Date());
		
		return save(questionCategory);
	}

}
