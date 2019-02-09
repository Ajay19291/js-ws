package com.jandarbar.ws.resources;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jandarbar.ws.entities.UserInfo;
import com.jandarbar.ws.services.UserService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping(path="/user")
public class UserResource 
{
	@Autowired
	private UserService userService;
	
	@RequestMapping(path="/getAll")
	public List<UserInfo> getAllUsers()
	{
		return userService.getAll();
	}
	
	@RequestMapping(path="/create")
	public UserInfo createUser(HttpServletRequest request)
	{
		return userService.create(request);
	}
	
	@RequestMapping(path="/get/{id}")
	public UserInfo getUserById(@PathVariable(value="id")Long id)
	{
		return userService.getById(id);
	}
	
	@PostMapping(path="/dologin")
	public UserInfo doLogin(HttpServletRequest request)
	{
		return userService.doLogin(request);
	}
	
	@RequestMapping("/test/{email}")
	public Object[] getData(@PathVariable(value="email") String emailId)
	{
		return userService.getData(emailId);
	}
}
