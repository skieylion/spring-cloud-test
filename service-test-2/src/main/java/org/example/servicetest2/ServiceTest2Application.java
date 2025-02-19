package org.example.servicetest2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ServiceTest2Application {

    public static void main(String[] args) {
        SpringApplication.run(ServiceTest2Application.class, args);
    }
}
