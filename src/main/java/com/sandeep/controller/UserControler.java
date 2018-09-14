package com.sandeep.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.sandeep.dto.UserDto;
import com.sandeep.service.UserService;

/**
 * Controller class for Users APIs
 * @author sandeepsoni
 *
 */

@RestController
public class UserControler {
	
	@Autowired
	UserService userService;
	
	
	
	@CrossOrigin
	@RequestMapping(value= "/login" ,method = RequestMethod.POST, consumes= "application/json" )
	public Map<String, Object> getUserDetails(@RequestBody UserDto userDto) throws Exception {
		Map<String, Object> response = null;
		if(userDto == null || StringUtils.isEmpty(userDto.getUserName()) || StringUtils.isEmpty(userDto.getPassword()))  {
			throw new Exception("Username/password cannot be null.");
		}
		UserDto userDetails = userService.getUserDetails(userDto);
		if(userDetails != null) {
			response = new HashMap<String, Object>();
			response.put("userDetails", userDetails);
			response.put("token", userDetails.hashCode());
		}
		return response;
		
	}

}
