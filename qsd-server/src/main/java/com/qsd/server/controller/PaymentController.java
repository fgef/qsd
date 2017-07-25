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
import com.qsd.model.UserInviteCode;
import com.qsd.server.inter.PaymentService;
import com.qsd.server.inter.UserInviteCodeService;
import com.qsd.util.DesUtil;

@Controller
@RequestMapping("/payment")
public class PaymentController {

	@Autowired
	PaymentService paymentService;
	@Autowired
	UserInviteCodeService userInviteCodeService;

	@ResponseBody
	@RequestMapping(value = "finish", method = RequestMethod.POST)
	public RespData finish(@RequestBody String json) throws Exception {
		Payment payment = null;
		// 支付完成
		payment = null;
		if (StringUtils.isEmpty(json)) {
			return RespData.getErrorResp(RespCode.ERROR, "empty json!");
		} else {
			payment = new Gson().fromJson(json, Payment.class);
			paymentService.finishPayment(payment);
		}

		// 产生邀请码
		String inviteCode = null;
		inviteCode = userInviteCodeService.generate(payment.getId(), payment.getId());
		UserInviteCode userInviteCode = UserInviteCode.getInstance(payment.getId(), payment.getUserId(), inviteCode);

		userInviteCodeService.create(userInviteCode);
		return RespData.getSuccResp(DesUtil.encrypt(inviteCode));
	}
}
