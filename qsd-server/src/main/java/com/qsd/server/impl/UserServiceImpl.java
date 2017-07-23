package com.qsd.server.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qsd.model.User;
import com.qsd.server.inter.UserService;
import com.qsd.server.mapper.UserMapper;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper mapper;

	@Override
	public Integer regist(User u) {
		return mapper.insertSelective(u);
	}

}
