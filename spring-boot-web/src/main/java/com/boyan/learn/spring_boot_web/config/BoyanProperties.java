package com.boyan.learn.spring_boot_web.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
/**
 * @Component 注解标示此类为properties配置文件的映射类
 * @author helenlee
 *
 */
@Component
public class BoyanProperties {
	@Value("${com.boyan.title}")
	private String title;
	@Value("${com.boyan.description}")
	private String description;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	

}
