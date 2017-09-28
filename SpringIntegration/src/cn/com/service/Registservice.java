package cn.com.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.com.dao.java.RegistMapper;
import cn.com.model.User;

@Service
public class Registservice {
	@Resource
	private RegistMapper mapper;
	public void regist(User user)throws Exception{
		mapper.insert(user);
	}
}
