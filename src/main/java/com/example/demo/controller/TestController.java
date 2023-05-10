package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

	@GetMapping("/")
	public String index() {
		System.out.println("회사에서 작업했3");
		return "index";
	}
	@GetMapping("/test")
	public String test() {
		return "test";
	}
	
}
