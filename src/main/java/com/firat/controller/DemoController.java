package com.firat.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DemoController {
	
	// http://localhost:8080//todo-list/hello
	@ResponseBody
	@GetMapping("/hello")
	public String hello() {
		return "hello";
	}
	
	
}
