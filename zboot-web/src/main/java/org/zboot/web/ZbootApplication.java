package org.zboot.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"org.zboot"})
public class ZbootApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZbootApplication.class, args);
	}

}

