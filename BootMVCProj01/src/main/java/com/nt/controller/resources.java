package com.nt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class resources {

	@RequestMapping("/")
	public String showHome() {
		return "hello";
	}
}