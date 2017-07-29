package com.boyan.learn.spring_boot_web.controller;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 视图解析器
 * 
 * @author helenlee
 *
 */
@Controller
public class ThymeleafController {

	@RequestMapping("/hi")
	public String hello(Locale locale, Model model) {
		//传递给页面的动态值
		model.addAttribute("greeting", "Hello!");
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		String formattedDate = dateFormat.format(date);
		model.addAttribute("currentTime", formattedDate);
		//返回页面的名称，视图解析器会根据名称去映射模版文件下的html
		return "hello";
	}

}