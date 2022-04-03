package com.cavnas.co.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("canvas")
public class CanvasController {
	
	@PostMapping("/post")
	@ResponseBody
	public Map<String, Object> post(
			@RequestParam(value = "file", required = false) MultipartFile file// upload file
	) throws IOException {
		
		Map<String , Object> result = new HashMap<String,Object>();
	
		
		return result;
	}

}
