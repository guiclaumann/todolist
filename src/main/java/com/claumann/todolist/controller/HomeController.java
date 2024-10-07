package com.claumann.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/meucontroller")
public class HomeController {

	@GetMapping
	public String getMethodName() {
		return "hello world";
	}

	@GetMapping(path = "/oi")
	public String getMethodName1() {
		return "testando path oi";
	}

	@GetMapping(path = "/test")
	public String getMethodName2(@RequestParam String id) {
		return "hello world 3, tudo bem: " + id;
	}
}
