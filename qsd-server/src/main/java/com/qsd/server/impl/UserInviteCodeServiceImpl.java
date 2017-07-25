package com.qsd.server.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qsd.model.UserInviteCode;
import com.qsd.server.inter.UserInviteCodeService;
import com.qsd.server.mapper.UserInviteCodeMapper;

@Service
public class UserInviteCodeServiceImpl implements UserInviteCodeService {

	@Autowired
	private UserInviteCodeMapper mapper;

	@Override
	public String generate(int paymentId, int userId) {
		int code = (int) ((Math.random() * 9 + 1) * 100000);
		String inviteCode = String.valueOf(code);
		return inviteCode;
	}

	@Override
	public Integer create(UserInviteCode userInviteCode) {
		return mapper.insert(userInviteCode);
	}

}
