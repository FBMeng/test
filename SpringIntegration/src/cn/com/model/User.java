package cn.com.model;

import org.codehaus.jackson.map.annotate.JsonSerialize;
import org.springframework.stereotype.Component;

@Component
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL)
public class User {
	private String id;
	private String nickname;
	private String password;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	
}
