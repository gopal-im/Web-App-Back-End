package com.grit.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.grit.model.UserMstr;
import com.grit.sevice.UserMstrService;

@CrossOrigin(origins="http://localhost:4200")  
@RestController
@RequestMapping(path = "/user")
public class UserMstrController {
	@Autowired
	UserMstrService userMstrService;
	@RequestMapping(value="/userLogin", method=RequestMethod.POST,headers="Accept=application/json")
	@ResponseBody
	public UserMstr isUserValid(@RequestBody HashMap user) {
		System.out.println("helloo======"+user);
		return userMstrService.userlogin((String)user.get("username"), (String)user.get("password"));
		 
	}
	
	/*@RequestMapping(value="/getAllUsers", method=RequestMethod.POST,headers="Accept=application/json")
	@ResponseBody
	public List getemployees(@RequestBody String users) {
		//return (List)employeeRepository.findAll();
	}*/
}
