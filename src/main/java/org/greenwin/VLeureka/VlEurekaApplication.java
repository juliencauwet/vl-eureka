package org.greenwin.VLeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class VlEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(VlEurekaApplication.class, args);
	}

}

