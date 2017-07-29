package com.boyan.learn.spring_boot_web.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MyFilter implements Filter {

	private static final Logger logger = LoggerFactory.getLogger(MyFilter.class);

	/**
	 * Filter 在spring容器的上层 Filter 感知不到spring的存在也就不能获取到spring注册的bean
	 * 如果非要在filter中使用spring注入的bean，可以使用上下文的方式获取它
	 */
	// @Autowired
	// private BoyanProperties boyanProperties;

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) arg0;
		// 拦截请求并打印请求链接
		logger.info(" this is Myfilter,URL:" + request.getRequestURL() + ",URI:" + request.getRequestURI());
		// 测试配置文件映射类
		// logger.info(" 测试配置文件映射类 tile:" + boyanProperties.getTitle() + ",description:"
		// + boyanProperties.getDescription());
		arg2.doFilter(arg0, arg1);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub

	}

}
