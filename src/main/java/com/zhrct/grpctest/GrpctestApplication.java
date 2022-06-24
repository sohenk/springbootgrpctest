package com.zhrct.grpctest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class GrpctestApplication {

    public static void main(String[] args) {
        SpringApplication.run(GrpctestApplication.class, args);
    }

}
