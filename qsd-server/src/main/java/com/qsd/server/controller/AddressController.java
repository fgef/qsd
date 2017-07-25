package com.qsd.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.qsd.data.RespCode;
import com.qsd.data.RespData;
import com.qsd.model.UserAddress;
import com.qsd.server.inter.UserAddressService;

@Controller
@RequestMapping("/address")
public class AddressController {

	@Autowired
	private UserAddressService userAddressService;

	@ResponseBody
	@RequestMapping(value = "validate")
	public RespData createAddress(@RequestBody String json) {
		if (!StringUtils.isEmpty(json)) {
			UserAddress addr = new Gson().fromJson(json, UserAddress.class);
			Integer id = userAddressService.createAddress(addr);
			return RespData.getSuccResp(id);
		} else {
			return RespData.getErrorResp(RespCode.ERROR, "empty json!");
		}
	}
}
