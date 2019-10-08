package com.MRyoung.test1.mapper;

import java.util.List;

import com.MRyoung.commons.mapper.MybatisMapper;
import com.MRyoung.test1.pojo.User;

@MybatisMapper
public interface UserMapper {
	public List<User> selAll();
}
