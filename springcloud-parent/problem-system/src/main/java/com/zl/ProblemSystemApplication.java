package com.zl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProblemSystemApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProblemSystemApplication.class,args);
    }
}
