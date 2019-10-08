package com.MRyoung.test1.pojo;

import com.MRyoung.commons.pojo.BasePojo;

public class User extends BasePojo {
	private int id;
	private String userName;
	private String password;
	private int age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + userName + ", password=" + password + ", age=" + age + "]";
	}
	public User() {
	}
	
	
}
