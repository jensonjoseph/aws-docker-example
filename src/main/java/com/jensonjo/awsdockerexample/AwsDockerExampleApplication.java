package com.jensonjo.awsdockerexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = { "com.jensonjo.awsdockerexample"})
@EnableAutoConfiguration
public class AwsDockerExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(AwsDockerExampleApplication.class, args);
	}

}
