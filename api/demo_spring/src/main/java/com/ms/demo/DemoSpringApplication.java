package com.ms.demo;

import com.ms.demo.beantest.MyBean;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@Slf4j
public class DemoSpringApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(DemoSpringApplication.class, args);

		MyBean myBean = applicationContext.getBean(MyBean.class);

		log.info("=== mybean is  {}",myBean);

	}

}
