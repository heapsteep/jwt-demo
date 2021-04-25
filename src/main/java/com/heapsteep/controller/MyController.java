package com.heapsteep.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@GetMapping("/")
	public String test() {
		return "Root working fine...";
	}
	
	@GetMapping("/2")
	public String test2() {
		return "URL 2...";
	}
	
	@GetMapping("/3")
	public String test3() {
		return "URL 3...";
	}
}
