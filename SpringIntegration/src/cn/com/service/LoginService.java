package cn.com.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.com.dao.java.LoginMapper;
import cn.com.model.User;

@Service
public class LoginService {

	@Resource
	private LoginMapper loMapper;
	
	public User login(String id,String password){
		User user;
		user = loMapper.select(id);
		return user;
	}
}
