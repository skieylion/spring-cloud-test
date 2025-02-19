package org.example.servicetest2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@RestController
@RefreshScope
public class Rest {
    @Autowired
    RestTemplate restTemplate;

    @Autowired
    WebClient.Builder webClientBuilder;

    @Value("${custom.message}")
    String message;

    @GetMapping("/products")
    public String getProducts() {
        String productServiceUrl = "http://service-test-1/products";
        return restTemplate.getForObject(productServiceUrl, String.class);
    }

    @GetMapping("/hello")
    public String getHello() {
        return message;
    }

    @GetMapping("/products/flux")
    public Mono<String> getProductsFlux() {
        return webClientBuilder.build()
                .get()
                .uri("http://service-test-1/products")
                .retrieve()
                .bodyToMono(String.class);
    }
}
