package com.qsd.server.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

	@ResponseBody
	@RequestMapping(value = "validate")
	public String validate() {
		return "1";
	}
}
