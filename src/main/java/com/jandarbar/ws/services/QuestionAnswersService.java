package com.jandarbar.ws.services;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jandarbar.ws.entities.QuestionAnswer;
import com.jandarbar.ws.repositories.QuestionAnswersRepository;

@Service
public class QuestionAnswersService extends GenericServiceImpl<QuestionAnswer>
{
	@Autowired
	private QuestionAnswersRepository answersRepository;

	public QuestionAnswer create(HttpServletRequest request) {
		QuestionAnswer questionAnswer = new QuestionAnswer();
		questionAnswer.setFkquestionid(new BigInteger(request.getParameter("questionId")));
		questionAnswer.setAnswer(request.getParameter("answerStr"));
		questionAnswer.setSequenceno(Integer.parseInt(request.getParameter("sequenceno")));
		questionAnswer.setIsdeleted("N");
		questionAnswer.setIsactive("Y");
		questionAnswer.setCreatedby(new BigInteger("100000"));
		questionAnswer.setCreateddate(new Date());
		save(questionAnswer);
		return questionAnswer;
	}
	

	public List<QuestionAnswer> findQuestionAnswerByQuestionId(BigInteger id) {
		return answersRepository.findByFkquestionid(id);
	}

}
