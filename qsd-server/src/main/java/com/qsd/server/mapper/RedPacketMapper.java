package com.qsd.server.mapper;

import com.qsd.model.RedPacket;

public interface RedPacketMapper {
	/**
	 * red_packet
	 */
	int deleteByPrimaryKey(Integer id);

	/**
	 * red_packet
	 */
	int insert(RedPacket record);

	/**
	 * red_packet
	 */
	int insertSelective(RedPacket record);

	/**
	 * red_packet
	 */
	RedPacket selectByPrimaryKey(Integer id);

	/**
	 * red_packet
	 */
	int updateByPrimaryKeySelective(RedPacket record);

	/**
	 * red_packet
	 */
	int updateByPrimaryKey(RedPacket record);
}