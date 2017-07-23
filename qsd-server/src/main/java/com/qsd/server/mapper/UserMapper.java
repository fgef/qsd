package com.qsd.server.mapper;

import org.springframework.stereotype.Service;

import com.qsd.model.User;

@Service
public interface UserMapper {
	/**
	 * user
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * user
	 */
	int insert(User record);

	/**
	 * user
	 */
	int insertSelective(User record);

	/**
	 * user
	 */
	User selectByPrimaryKey(Integer id);

	/**
	 * user
	 */
	int updateByPrimaryKeySelective(User record);

	/**
	 * user
	 */
	int updateByPrimaryKey(User record);
}