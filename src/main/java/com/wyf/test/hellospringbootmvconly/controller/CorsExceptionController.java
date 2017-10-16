package com.wyf.test.hellospringbootmvconly.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CorsExceptionController {

	@ResponseBody
	@RequestMapping("/cors/testCors/exception")
	public Object testCors(//
			HttpServletRequest req, //
			HttpServletResponse resp//
	) {
		int i = 5 / 0;
		return null;
	}

	@ResponseBody
	@RequestMapping("/cors/testCorsApplicationJson/exception")
	public Object testCorsApplicationJson(//
			@RequestBody Map map, //
			HttpServletRequest req, //
			HttpServletResponse resp//
	) {
		int i = 5 / 0;
		return null;
	}
	
	
	@ResponseBody
	@RequestMapping("/cors/testCors/exception/methodHandle")
	public Object testCorsMethodHandle(//
			HttpServletRequest req, //
			HttpServletResponse resp//
	) {
		try {
			int i = 5 / 0;
			
			// 把它改到
			resp.setHeader("Access-Control-Allow-Origin", "*");
			resp.setHeader("Access-Control-Allow-Methods", "GET,POST,PUT,DELETE,OPTIONS");
			resp.setHeader("Access-Control-Allow-Headers", "Content-Type,Origin,Accept");
			resp.setHeader("Access-Control-Allow-Credentials", "true");
			resp.setHeader("Access-Control-Max-Age", "1800");
		} catch (Exception e) {
			throw new RuntimeException("web exception:", e);
		} finally {
//			resp.setHeader("Access-Control-Allow-Origin", "*");
//			resp.setHeader("Access-Control-Allow-Methods", "GET,POST,PUT,DELETE,OPTIONS");
//			resp.setHeader("Access-Control-Allow-Headers", "Content-Type,Origin,Accept");
//			resp.setHeader("Access-Control-Allow-Credentials", "true");
//			resp.setHeader("Access-Control-Max-Age", "1800");
		}
		return null;
	}

	@ResponseBody
	@RequestMapping("/cors/testCorsApplicationJson/exception/methodHandle")
	public Object testCorsApplicationJsonMethodHandle(//
			@RequestBody Map map, //
			HttpServletRequest req, //
			HttpServletResponse resp//
	) {
		try {
			int i = 5 / 0;
			
			resp.setHeader("Access-Control-Allow-Origin", "*");
			resp.setHeader("Access-Control-Allow-Methods", "GET,POST,PUT,DELETE,OPTIONS");
			resp.setHeader("Access-Control-Allow-Headers", "Content-Type,Origin,Accept");
			resp.setHeader("Access-Control-Allow-Credentials", "true");
			resp.setHeader("Access-Control-Max-Age", "1800");
		} catch (Exception e) {
			throw new RuntimeException("web exception:", e);
		} finally {
//			resp.setHeader("Access-Control-Allow-Origin", "*");
//			resp.setHeader("Access-Control-Allow-Methods", "GET,POST,PUT,DELETE,OPTIONS");
//			resp.setHeader("Access-Control-Allow-Headers", "Content-Type,Origin,Accept");
//			resp.setHeader("Access-Control-Allow-Credentials", "true");
//			resp.setHeader("Access-Control-Max-Age", "1800");
		}
		return null;
	}
}
