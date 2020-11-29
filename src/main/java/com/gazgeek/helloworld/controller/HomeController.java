package com.gazgeek.helloworld.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;

import com.gazgeek.helloworld.component.ApplicationContextHolder;

//@RestController
public class HomeController {

	@RequestMapping("/")
	public String home() {
		final ApplicationContext ac = ApplicationContextHolder.ac;
		return "Hello from GazGeek!";
	}

}
