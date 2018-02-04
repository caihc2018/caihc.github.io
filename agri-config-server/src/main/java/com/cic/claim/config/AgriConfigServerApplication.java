package com.cic.claim.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableDiscoveryClient
@EnableConfigServer
@SpringBootApplication
public class AgriConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgriConfigServerApplication.class, args);
	}
}
