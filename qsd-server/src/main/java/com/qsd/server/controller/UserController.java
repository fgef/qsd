package com.qsd.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.qsd.data.RespCode;
import com.qsd.data.RespData;
import com.qsd.model.User;
import com.qsd.server.inter.UserService;
import com.qsd.util.MD5;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@ResponseBody
	@RequestMapping(value = "validate")
	public String validate() {
		return "123";
	}

	@ResponseBody
	@RequestMapping(value = "regist", method = RequestMethod.POST)
	public RespData regist(@RequestParam("phone") String phone, @RequestParam("encrypt") String encrypt)
			throws Exception {
		String r = MD5.GetMD5Code(phone);
		if (r != null && r.equals(encrypt)) {
			User u = User.getRegistInstance(phone);
			Integer id = userService.regist(u);
			return RespData.getSuccResp(id);
		} else {
			return RespData.getErrorResp(RespCode.USER_WRONG_PHONE_ENCRYPT, "validate phone num wrong!");
		}
	}
}
