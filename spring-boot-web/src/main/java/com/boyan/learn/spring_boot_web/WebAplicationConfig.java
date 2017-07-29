package com.boyan.learn.spring_boot_web;

import org.apache.catalina.filters.RemoteIpFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.boyan.learn.spring_boot_web.filter.MyFilter;

/*定义为注解类*/
@Configuration
public class WebAplicationConfig {
	
	@Bean
	public RemoteIpFilter remoteIpFilter() {
		return new RemoteIpFilter();
	}
	
	/**定义一个FilterRegistrationBean 并将自定义的filter 注册到filter链中*/
	@Bean
	public FilterRegistrationBean testFilterRegistrationBean() {
		FilterRegistrationBean registrationBean = new FilterRegistrationBean();
		registrationBean.setFilter(new MyFilter());
		registrationBean.addUrlPatterns("/*");
		registrationBean.addInitParameter("paramName", "paramValue");
		registrationBean.setName("MyFilter");
		registrationBean.setOrder(1);
		return registrationBean;
	}

}
