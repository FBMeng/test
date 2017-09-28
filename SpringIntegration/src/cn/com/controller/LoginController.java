package cn.com.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.com.model.User;
import cn.com.service.LoginService;
import common.model.Msg;


@Controller
public class LoginController {
	@Resource
	private LoginService loService;
	
	@ResponseBody
	@RequestMapping(value="/login",method=RequestMethod.POST)
	public Object login(
			@RequestParam("id")String id,
			@RequestParam("password")String password){
		Msg msg = new Msg();
		
		msg.setCode(200);
		
		User user = new User();
		String word = "�˺Ų�����";
		try{
			user = loService.login(id, password);
			if(id.equals(user.getId())&&password.equals(user.getPassword())){
				word = "��½DoubleHShop";
			}
			if(id.equals(user.getId())&&!password.equals(user.getPassword())){
				word = "���벻��ȷ";
			}
		}catch(NullPointerException e){
			msg.setCode(100);
			msg.setDescribe(word);
			return msg;
		}
			
		msg.setDescribe(word);
		return msg;
	}
}
