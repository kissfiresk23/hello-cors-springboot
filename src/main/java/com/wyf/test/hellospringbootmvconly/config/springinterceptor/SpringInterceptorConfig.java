package com.wyf.test.hellospringbootmvconly.config.springinterceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.wyf.test.hellospringbootmvconly.config.cors.CorsIntercetor;

@Configuration
public class SpringInterceptorConfig extends WebMvcConfigurerAdapter {

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		//registry.addInterceptor(new CorsIntercetor()).addPathPatterns("/**");
	}

}
