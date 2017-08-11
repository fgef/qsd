package com.qsd.server.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.qsd.util.DesUtil;

@Controller
@RequestMapping("/system")
public class SystemController {

	@RequestMapping(value = "curtime")
	public String curtime() {
		Date d = new Date();
		try {
			return DesUtil.encrypt(String.valueOf(d.getTime()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
