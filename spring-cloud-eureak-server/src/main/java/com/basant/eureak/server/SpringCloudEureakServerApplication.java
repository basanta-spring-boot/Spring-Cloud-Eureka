package com.basant.eureak.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudEureakServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudEureakServerApplication.class, args);
	}
}
