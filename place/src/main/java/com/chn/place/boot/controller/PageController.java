package com.chn.place.boot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import io.swagger.annotations.ApiOperation;

@Controller
public class PageController {
	
	@RequestMapping("/")
	@ApiOperation(value = "사용자 리스트", notes = "사용자 리스트를 가져옵니다.")
	public String index() {
		return "index";
	}
}
