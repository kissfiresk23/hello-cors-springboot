package com.wyf.test.hellospringbootmvconly.controller;

import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CorsController {
	@RequestMapping("/")
	public String testhtml() {
		return "/index";
	}

	@ResponseBody
	@RequestMapping("cors/testCors")
	public Object testCors(//
			HttpServletRequest req, //
			HttpServletResponse resp//
	) {
		System.out.println("===== testCors ==== req method:" + req.getMethod() + ",req url:" + req.getRequestURL());
		Map<String, Object> result = new LinkedHashMap<>();
		result.put("reqMethod", req.getMethod());
		result.put("reqUrl", req.getRequestURL());
		result.put("date", new Date());
		result.put("msg", "成功");
		return result;
	}

	@ResponseBody
	@RequestMapping("/cors/testCorsApplicationJson")
	public Object testCorsApplicationJson(//
			@RequestBody Map map, //
			HttpServletRequest req, //
			HttpServletResponse resp//
	) {
		System.out.println("===== testCorsApplicationJson ==== req method:" + req.getMethod() + ",req url:" + req.getRequestURL());
		System.out.println("===== testCorsApplicationJson ==== input param:" + map);

		Map<String, Object> result = new LinkedHashMap<>();
		result.put("reqMethod", req.getMethod());
		result.put("reqUrl", req.getRequestURL());
		result.put("reqParam", map);
		result.put("date", new Date());
		result.put("msg", "成功");
		return result;
	}
}
