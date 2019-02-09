package com.jandarbar.ws.services;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jandarbar.ws.entities.UserInfo;
import com.jandarbar.ws.repositories.UserRepository;

@Service
public class UserService extends GenericServiceImpl<UserInfo>
{

	@Autowired
	private UserRepository userRepository;
	
	public UserInfo create(HttpServletRequest request) {
		
		
		return null;
	}

	public UserInfo doLogin(HttpServletRequest request) {
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		return userRepository.findByEmailidAndPasswordAndType(username, password,"U");
	}

	public Object[] getData(String emailId) {
		return userRepository.getUserDetails(emailId);
	}


}
