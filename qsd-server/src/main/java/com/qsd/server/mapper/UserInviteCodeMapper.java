package com.qsd.server.mapper;

import com.qsd.model.UserInviteCode;

public interface UserInviteCodeMapper {
	/**
	 * user_invite_code
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * user_invite_code
	 */
	int insert(UserInviteCode record);

	/**
	 * user_invite_code
	 */
	int insertSelective(UserInviteCode record);

	/**
	 * user_invite_code
	 */
	UserInviteCode selectByPrimaryKey(Integer id);

	/**
	 * user_invite_code
	 */
	int updateByPrimaryKeySelective(UserInviteCode record);

	/**
	 * user_invite_code
	 */
	int updateByPrimaryKey(UserInviteCode record);
}