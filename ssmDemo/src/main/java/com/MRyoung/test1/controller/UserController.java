package com.MRyoung.test1.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.MRyoung.test1.pojo.User;
import com.MRyoung.test1.service.UserService;

@Controller
public class UserController {
	
	@Resource
	private UserService userService;
	
	@RequestMapping(value= {"list",""})
	public String list(Model model) {
		List<User> list=userService.selAll();
		model.addAttribute("list", list);
		return "list";
	}
}
