package org.example.router;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/fallback")
public class FallbackController {
    @GetMapping
    public Mono<String> fallback() {
        return Mono.just("Сервис временно недоступен, попробуйте позже.");
    }
}
