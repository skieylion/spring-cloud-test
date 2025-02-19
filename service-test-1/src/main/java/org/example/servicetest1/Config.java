package org.example.servicetest1;

import org.springframework.boot.web.client.RestTemplateCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.client.ClientHttpRequestInterceptor;

import java.util.List;

@Configuration
public class Config {
    @Bean
    public RestTemplateCustomizer eurekaRestTemplateCustomizer() {
        return restTemplate -> {
            List<ClientHttpRequestInterceptor> interceptors = restTemplate.getInterceptors();
            interceptors.add(new BasicAuthInterceptor("admin", "admin"));
            restTemplate.setInterceptors(interceptors);
        };
    }
}
