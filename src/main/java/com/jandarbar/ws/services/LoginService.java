package com.jandarbar.ws.services;

import java.math.BigInteger;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jandarbar.ws.entities.CandidateInfo;
import com.jandarbar.ws.entities.UserInfo;
import com.jandarbar.ws.repositories.CandidateRepository;
import com.jandarbar.ws.repositories.UserRepository;

@Service
public class LoginService {

	@Autowired 
	private UserRepository userRepository;
	
	@Autowired
	private CandidateRepository candidateRepository;
	
	public Object doLogin(HttpServletRequest request) {
		
		String username = request.getParameter("email_id");
		String password = request.getParameter("password");
		List<UserInfo> list = userRepository.isValidUser(username, password);
		
		if(list == null || list.size() < 1)
		{
			return new LoginResponse("FAILED", "User Id or Password Incorrect !", null);
		}
		else
		{
			return new LoginResponse("SUCCESS", "Login Succesfull !", list.get(0));
		}
		
	}
	
	public Object doAdminLogin(HttpServletRequest request) {
		
		String username = request.getParameter("email_id");
		String password = request.getParameter("password");
		String type = request.getParameter("type");
		UserInfo userInfo = null;
		//CandidateInfo candiateInfo = candidateRepository.findByEmailidAndPasswordAndType(username, password,type);
		CandidateInfo candiateInfo = candidateRepository.findByEmailidAndPassword(username, password);
		if(candiateInfo == null)
		{
			return new LoginResponse("FAILED", "User Id or Password Incorrect !", null);
		}
		else
		{
			LoginResponse loginResponse = new LoginResponse("SUCCESS", "Login Succesfull !", userInfo);
			loginResponse.setCandidateInfo(candiateInfo);
			return loginResponse;
		}
		
	}
	
	static class LoginResponse
	{
		private String status;
		private String message;
		private UserInfo details;
		private CandidateInfo candidateInfo;

		public LoginResponse(String status, String message, UserInfo details) {
			super();
			this.status = status;
			this.message = message;
			this.details = details;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}

		public UserInfo getDetails() {
			return details;
		}

		public void setDetails(UserInfo details) {
			this.details = details;
		}

		public CandidateInfo getCandidateInfo() {
			return candidateInfo;
		}

		public void setCandidateInfo(CandidateInfo candidateInfo) {
			this.candidateInfo = candidateInfo;
		}
		
		
	}

}
