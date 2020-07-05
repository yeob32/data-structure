package com.example.demo.spring.bean;

import java.util.UUID;

public class SomeBean {

    private UUID id;
    private String name;

    public SomeBean(UUID id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
