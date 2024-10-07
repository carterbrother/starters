package com.ms.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoAopApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ac = SpringApplication.run(DemoAopApplication.class, args);

		ac.getBean(Biz.class).m1();
	}

}
