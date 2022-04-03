package com.cavnas.co.controller;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class TestController {
	
	@GetMapping("/")
	@ResponseBody
	public String main() throws IOException {
		
		return "<h1>canvas API</h1>";
	}

}
