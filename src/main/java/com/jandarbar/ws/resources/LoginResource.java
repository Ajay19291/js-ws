package com.jandarbar.ws.resources;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jandarbar.ws.services.LoginService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class LoginResource 
{
	@Autowired
	private LoginService loginService;
	
	@PostMapping(path="/login")
	public Object doLogin(HttpServletRequest request)
	{
		return loginService.doLogin(request);
		
	}
	
	@PostMapping(path="/adminlogin")
	public Object doAdminLogin(HttpServletRequest request)
	{
		return loginService.doAdminLogin(request);
		
	}

}
