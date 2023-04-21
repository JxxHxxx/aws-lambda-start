package com.jxx.lambda;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

@SpringBootApplication
public class LambdaApplication {

    public static Integer requestCnt = 0;

    @Bean
    public Consumer<String> uppercase() {
        return value -> System.out.println(value.toUpperCase());
    }

    @Bean
    public Supplier<Integer> requestSum() {
        return () -> ++requestCnt;
    }

    public static void main(String[] args) {
        SpringApplication.run(LambdaApplication.class, args);
    }

}
