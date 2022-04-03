package com.cavnas.co.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.cavnas.co.service.GoogleService;
import com.google.protobuf.ByteString;

@RestController
@RequestMapping("canvas")
public class CanvasController {
	
	
	@Autowired
	private GoogleService googleService;
	
	@PostMapping("/post")
	@ResponseBody
	public Map<String, Object> post(
			@RequestParam(value = "file", required = false) MultipartFile file// upload file
	) throws IOException {
		
		byte [] byteArray =  file.getBytes();
		ByteString imgBytes  = ByteString.copyFrom(byteArray);
		System.out.println("file ::" +  imgBytes);
		
		googleService.detectText(imgBytes);
		//ByteString imgBytes = file.getBytes();
		Map<String , Object> result = new HashMap<String,Object>();
		
		result.put("test", "test!!");
		result.put("status","200" );
		return result;
	}
	
	
	//JAVA Controller source
	//MultipartHttpServletRequest 타입으로 받는다.
	@PostMapping(value="/test")
	@ResponseBody
	public void test(@RequestBody Map<String, Object> param ) throws Exception{
	     String ImgReader = param.get("image")+ ""; 
	     googleService.detectTextFromImage(ImgReader);
		
	}
}
