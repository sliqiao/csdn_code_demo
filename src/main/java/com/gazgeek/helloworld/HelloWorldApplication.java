package com.gazgeek.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class HelloWorldApplication {

	public static void main(String[] args) throws Exception {
		final ConfigurableApplicationContext ac = SpringApplication.run(HelloWorldApplication.class,
				args);
		ac.close();
	}

}