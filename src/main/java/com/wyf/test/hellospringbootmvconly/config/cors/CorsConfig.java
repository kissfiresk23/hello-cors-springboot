package com.wyf.test.hellospringbootmvconly.config.cors;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 处理跨域
 * <p>
 * 最好的教程：http://www.ruanyifeng.com/blog/2016/04/cors.html
 * 
 * @author Stone
 *
 */
@Configuration
public class CorsConfig extends WebMvcConfigurerAdapter {

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		// 网上有些教程就一行代码 registry.addMapping("/**"); 是有问题的：只支持GET、POST，不支持PUT、DELETE、OPTIONS以及contentType是application/json的POST请求
		// registry.addMapping("/**");

		// 最万能的解决办法如下，亲测支持GET、POST、PUT、DELETE、OPTIONS、application/json
		registry.addMapping("/**")//
				.allowedOrigins("*")// 默认是 *
				.allowedMethods("*")// 默认是 simple methods（即 GET、HEAD、POST 并不包含 PUT、DELETE 和 OPTIONS 等）
				.allowedHeaders("*")// 默认是 *
				.allowCredentials(true)// 默认是 true
				.maxAge(1800);// 默认是 1800 秒
	}
}