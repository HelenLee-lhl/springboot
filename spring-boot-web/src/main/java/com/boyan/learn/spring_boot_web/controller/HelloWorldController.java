package com.boyan.learn.spring_boot_web.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boyan.learn.spring_boot_web.domain.User;

/**
 * @RestController springboot 支持json 格式的数据返回
 * @author helenlee
 *
 */
@RestController
@RequestMapping("/index")
public class HelloWorldController {
	@RequestMapping("getUser")
	public User getUser() {
		User user = new User();
		user.setName("HelenLee");
		user.setAge(28);
		user.setWorkNo("110");
		return user;
	}

}
