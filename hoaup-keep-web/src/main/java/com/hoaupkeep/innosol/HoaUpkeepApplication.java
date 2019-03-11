package com.hoaupkeep.innosol;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@EnableConfigurationProperties
@SpringBootApplication
public class HoaUpkeepApplication {

	public static void main(String[] args) {
		SpringApplication.run(HoaUpkeepApplication.class, args);
	}
}
