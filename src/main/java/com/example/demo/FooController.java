package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

import java.time.Duration;

@RestController
@RequestMapping("/api")
public class FooController {

    @GetMapping("/foo")
    public Flux<Foo> getFoo() {
        return Flux.interval(Duration.ofSeconds(1))
                .map(sequence -> new Foo(sequence, "Foo " + sequence));
    }
}
