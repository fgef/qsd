package com.qsd.server.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qsd.model.UserAddress;
import com.qsd.server.inter.UserAddressService;
import com.qsd.server.mapper.UserAddressMapper;

@Service
public class UserAddressServiceImpl implements UserAddressService {

	@Autowired
	private UserAddressMapper mapper;

	@Override
	public Integer createAddress(UserAddress addr) {
		return mapper.insertSelective(addr);
	}

}
