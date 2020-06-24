package com.example.demo.spring.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class SomeService {

    @Bean
    @Scope(value = "prototype")
    public SomeBean someBean() {
        return new SomeBean(UUID.randomUUID(), "some-bean");
    }
}
