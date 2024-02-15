package com.dataforge.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

	@GetMapping("/welcomemsg")
	public String welcomemessage() {

		String str = "welcome to spring security";
		return str;
	}
	
	@GetMapping("/security")
	public String sayhellosecurity() {
		
		String msg="Hello Spring Security, comming to your hand";
		return msg;
	}
}
