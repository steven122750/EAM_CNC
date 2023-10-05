package com.EAM_CNC.springproyectdocker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class SpringProyectDockerApplication {

	@RequestMapping("/")
	public String home(){
		return "Hello world";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringProyectDockerApplication.class, args);
	}

}

