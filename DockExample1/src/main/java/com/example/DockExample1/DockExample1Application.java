package com.example.DockExample1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@RequestMapping("/api/dock-demo1")
public class DockExample1Application {

	@GetMapping
	public String getMessage(){
		return "This application working well.....";
	}

	public static void main(String[] args) {
		SpringApplication.run(DockExample1Application.class, args);
	}

}
