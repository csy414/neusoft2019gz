package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/add")
	public String add() throws Exception{
		return "成功啦!~";
	}
}
