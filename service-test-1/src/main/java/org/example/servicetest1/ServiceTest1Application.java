package org.example.servicetest1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ServiceTest1Application {

    public static void main(String[] args) {
        SpringApplication.run(ServiceTest1Application.class, args);
    }

    @GetMapping("/products")
    public String getProducts() {
        return "list of products";
    }

}
