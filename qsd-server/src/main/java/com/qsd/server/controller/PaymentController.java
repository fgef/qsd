package com.qsd.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.qsd.data.RespCode;
import com.qsd.data.RespData;
import com.qsd.model.Payment;
import com.qsd.server.inter.PaymentService;
import com.qsd.util.DesUtil;

@Controller
@RequestMapping("/payment")
public class PaymentController {

	@Autowired
	PaymentService paymentService;

	@ResponseBody
	@RequestMapping(value = "finish", method = RequestMethod.POST)
	public RespData regist(@RequestBody String json) throws Exception {
		String inviteCode = null;
		if (StringUtils.isEmpty(json)) {
			return RespData.getErrorResp(RespCode.ERROR, "empty json!");
		} else {
			Payment payment = new Gson().fromJson(json, Payment.class);
			paymentService.finishPayment(payment);
		}
		return RespData.getSuccResp(DesUtil.encrypt(inviteCode));
	}
}
