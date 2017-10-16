//package com.wyf.test.hellospringbootmvconly.config.cors;
//
//import java.io.IOException;
//
//import javax.servlet.Filter;
//import javax.servlet.FilterChain;
//import javax.servlet.FilterConfig;
//import javax.servlet.ServletException;
//import javax.servlet.ServletRequest;
//import javax.servlet.ServletResponse;
//import javax.servlet.annotation.WebFilter;
//import javax.servlet.http.HttpServletResponse;
//
//import org.springframework.core.annotation.Order;
//
//@WebFilter(filterName = "myFilter", urlPatterns = { "/*" })
//@Order(-1)
//public class CorsFilter implements Filter {
//
//	@Override
//	public void init(FilterConfig filterConfig) throws ServletException {
//	}
//
//	
//	@Override
//	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
//		HttpServletResponse response = (HttpServletResponse) resp;
//		
//        // 该配置已经测试了支持GET、POST、PUT、DELETE、OPTIONS、ContentType是application/json的POST方式
//		response.setHeader("Access-Control-Allow-Origin", "*");
//		response.setHeader("Access-Control-Allow-Methods", "GET,POST,PUT,DELETE,OPTIONS");// 不明白，为什么要明确指定，用*就会导致PUT、DELETE失效
//		response.setHeader("Access-Control-Allow-Headers", "Content-Type,Origin,Accept");// 同样这里不能用*
//		response.setHeader("Access-Control-Allow-Credentials", "true");
//		response.setHeader("Access-Control-Max-Age", "1800");
//        
//		chain.doFilter(req, resp);
//	}
//
//	@Override
//	public void destroy() {
//	}
//
//}
