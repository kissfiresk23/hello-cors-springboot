package com.wyf.test.hellospringbootmvconly.controller;

import java.util.Date;
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
	public String index() {
		return "/index";
	}
	
	/**
	 * 到达测试CORS的页面（接口未发生异常的情况）
	 * @return
	 * @author Stone
	 */
	@RequestMapping("/toTestCorsNonExceptionPage")
	public String toTestCorsNonExceptionPage() {
		return "/test-cors-non-exception";
	}
	
	/**
	 * 到达测试CORS的页面，测试请求的controller方法会发生异常，看发生异常的情况下，能否正确防止跨域
	 * （有些时候接口异常导致response里并未setHeader成功，从而导致误判未处理跨域，而实际上是接口异常；rest接口
	 * 都需要处理好异常，以code的形式作为接口返回；这里为了健壮性，假设接口在异常的时候未包装好，以此检测跨域处理方案是否健壮）
	 * @return
	 * @author Stone
	 */
	@RequestMapping("/toTestCorsExceptionPage")
	public String toTestCorsExceptionPage() {
		return "/test-cors-exception";
	}

	@ResponseBody
	@RequestMapping("/cors/testCors")
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
