package com.app.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebServicesApplication 
{

	public static void main(String[] args) 
	{
		System.out.println("This is web services Program");
		SpringApplication.run(WebServicesApplication.class, args);
	}

}
