package com.qsd.server.mapper;

import com.qsd.model.Payment;

public interface PaymentMapper {
	/**
	 * payment
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * payment
	 */
	int insert(Payment record);

	/**
	 * payment
	 */
	int insertSelective(Payment record);

	/**
	 * payment
	 */
	Payment selectByPrimaryKey(Integer id);

	/**
	 * payment
	 */
	int updateByPrimaryKeySelective(Payment record);

	/**
	 * payment
	 */
	int updateByPrimaryKey(Payment record);
}