package cn.com.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.com.dao.java.UserMapper;
import cn.com.model.UserTest;

@Service
public class FirstService {

	@Resource
	private UserMapper userMapper;
	public void method(UserTest user){
		System.out.println("YOU ARE SUCCESSFUL!!!");
		userMapper.insert(user);
	}
}
