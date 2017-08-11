package com.qsd.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qsd.data.RespData;
import com.qsd.server.inter.PaymentService;
import com.qsd.server.inter.UserInviteCodeService;

@Controller
@RequestMapping("/redpackage")
public class RedpackageController {

	@Autowired
	PaymentService paymentService;

	@Autowired
	UserInviteCodeService userInviteCodeService;

	@ResponseBody
	@RequestMapping(value = "/pay/distribute", method = RequestMethod.POST)
	public RespData distribute(@RequestParam("userId") String userId) throws Exception {

		return RespData.getSuccResp();
	}
}
