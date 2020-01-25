package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@SpringBootApplication
public class DemoApplication {
	@RequestMapping("/")
	public String mainPage(){
		return "redirect: success.html";
	}

	@RequestMapping("logout")
	public String logout(){
		return "redirect: mylogin.html";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
