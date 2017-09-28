package cn.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.com.model.UserTest;
import cn.com.service.FirstService;
import main.springManager.SpringManager;

@Controller
public class FirstController {
	@Autowired
	private FirstService service;
	@Autowired
	private SpringManager springManager;
	@Autowired
	private UserTest user;

	@ResponseBody
	@RequestMapping("/method")
	public UserTest firstmethod(
			@RequestParam("name") String name, 
			@RequestParam("sex") String sex,
			@RequestParam("age") int age,
			Model m) {
		System.out.println(name+" "+sex+" "+age);
		user.setName(name);
		user.setSex(sex);
		user.setAge(age);
//		service.method(user);
//		manager.get();
//		m.addAttribute("user",user);
		return user;
	}
}

// (name="springManager")