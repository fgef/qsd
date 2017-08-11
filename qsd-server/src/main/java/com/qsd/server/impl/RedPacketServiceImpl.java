package com.qsd.server.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.qsd.model.RedPacket;
import com.qsd.server.inter.RedPacketService;
import com.qsd.server.mapper.RedPacketMapper;

@Service
public class RedPacketServiceImpl implements RedPacketService {

	@Autowired
	RedPacketMapper mapper;

	@Override
	public Integer create(RedPacket redpacket) {
		return mapper.insert(redpacket);
	}

}
