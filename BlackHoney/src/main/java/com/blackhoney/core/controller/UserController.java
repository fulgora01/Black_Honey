package com.blackhoney.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.blackhoney.core.entity.User;
import com.blackhoney.core.repository.RoleRepository;
import com.blackhoney.core.service.UserService;

@Controller
public class UserController {
	
	@Autowired 
	UserService userService;
	
	@Autowired
	RoleRepository roleRepository;
	
	@GetMapping("/")
	public String index() {
		return "index.html";
	}
	
	@GetMapping("/userForm")
	public String getUserForm(Model model)
	{
		model.addAttribute("userForm", new User());
		model.addAttribute("userList",userService.getAllUsers());
		 model.addAttribute("roles",roleRepository.findAll());
		
		return "user-form/user-view";
	}

}
