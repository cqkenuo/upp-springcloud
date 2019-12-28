package com.upp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@MapperScan("com.upp.dao")
@EnableEurekaClient
public class UppConnectorsApplication {

	public static void main(String[] args) {
		SpringApplication.run(UppConnectorsApplication.class, args);
	}
}
