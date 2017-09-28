package test;

import javax.annotation.Resource;

import org.junit.Test;

import cn.com.model.User;
import cn.com.service.LoginService;

public class TestLogin {
	@Resource
	private LoginService service;
	@Test
	public void testLogin(){
		User user =service.login("mmm","123");
		System.out.println(user.getId());
	}

}
