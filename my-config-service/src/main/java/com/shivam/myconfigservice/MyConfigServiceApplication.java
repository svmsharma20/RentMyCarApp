package com.shivam.myconfigservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class MyConfigServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyConfigServiceApplication.class, args);
	}

}
