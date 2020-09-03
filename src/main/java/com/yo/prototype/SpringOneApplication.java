package com.yo.prototype;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Function;

@SpringBootApplication
public class SpringOneApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringOneApplication.class, args);
    }

    @Bean
    public Function<String, String> upperCase() {
        return s -> {
            System.out.println(s.toUpperCase());
            return s.toUpperCase();
        };
    }
}
