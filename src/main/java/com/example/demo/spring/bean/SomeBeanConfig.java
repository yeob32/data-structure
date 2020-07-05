package com.example.demo.spring.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class SomeBeanConfig {

    @Bean
    @Scope(value = "prototype")
    public SomeBean someBean() {
        return new SomeBean(UUID.randomUUID(), "some-bean");
    }

    @Bean
    @Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
    public SomeBean someBeanByTargetClass() {
        return new SomeBean(UUID.randomUUID(), "some-bean");
    }
}
