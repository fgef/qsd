package com.qsd.server.mapper;

import com.qsd.model.OrderItem;

public interface OrderItemMapper {
	/**
	 * order_item
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * order_item
	 */
	int insert(OrderItem record);

	/**
	 * order_item
	 */
	int insertSelective(OrderItem record);

	/**
	 * order_item
	 */
	OrderItem selectByPrimaryKey(Integer id);

	/**
	 * order_item
	 */
	int updateByPrimaryKeySelective(OrderItem record);

	/**
	 * order_item
	 */
	int updateByPrimaryKey(OrderItem record);
}