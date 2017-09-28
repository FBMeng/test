package cn.com.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.com.model.User;
import cn.com.service.Registservice;
import common.model.Msg;

@Controller
public class RegistController {
	@Resource
	private Registservice reService;
	
	@ResponseBody
	@RequestMapping(value="/regist",method=RequestMethod.POST)
	public Object regist(
			@RequestParam("id")String id,
			@RequestParam("nickname")String nickname,
			@RequestParam("password")String password){
		
		Msg msg = new Msg();
		msg.setCode(200);
		msg.setDescribe("注册成功");
		
		User user = new User();
		user.setId(id);
		user.setNickname(nickname);
		user.setPassword(password);
		
		try{
			reService.regist(user);
		}catch(Exception e){
			msg.setCode(100);
			msg.setDescribe("id已经存在");
			return msg;
		}
		
		return msg;
	}
}
