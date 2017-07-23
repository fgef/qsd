package com.qsd.server.mapper;

import com.qsd.model.UserAddress;

public interface UserAddressMapper {
	/**
	 * user_address
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * user_address
	 */
	int insert(UserAddress record);

	/**
	 * user_address
	 */
	int insertSelective(UserAddress record);

	/**
	 * user_address
	 */
	UserAddress selectByPrimaryKey(Integer id);

	/**
	 * user_address
	 */
	int updateByPrimaryKeySelective(UserAddress record);

	/**
	 * user_address
	 */
	int updateByPrimaryKey(UserAddress record);
}