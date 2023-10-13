package com.springboot.app5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@ServletComponentScan(basePackages="com.springboot.app5")
@EnableWebMvc
public class ApiApp {

	public static void main(String[] args) {
		SpringApplication.run(ApiApp.class, args);

	}

}
