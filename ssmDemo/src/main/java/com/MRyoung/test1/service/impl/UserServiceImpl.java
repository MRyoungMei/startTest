package com.MRyoung.test1.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.MRyoung.test1.mapper.UserMapper;
import com.MRyoung.test1.pojo.User;
import com.MRyoung.test1.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Resource
	UserMapper userMapper;
	
	public List<User> selAll() {
		return userMapper.selAll();
	}
}
