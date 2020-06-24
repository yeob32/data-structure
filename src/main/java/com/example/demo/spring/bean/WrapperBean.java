package com.example.demo.spring.bean;

import org.springframework.stereotype.Component;

@Component
public class WrapperBean {

    private final SomeBean someBean;

    public WrapperBean(SomeBean someBean) {
        this.someBean = someBean;
    }

    public SomeBean getSomeBean() {
        return someBean;
    }
}
