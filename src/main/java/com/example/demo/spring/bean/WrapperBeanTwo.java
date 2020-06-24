package com.example.demo.spring.bean;

import org.springframework.stereotype.Component;

@Component
public class WrapperBeanTwo {

    private final WrapperBean wrapperBean;

    public WrapperBeanTwo(WrapperBean wrapperBean) {
        this.wrapperBean = wrapperBean;
    }

    public WrapperBean getWrapperBean() {
        return wrapperBean;
    }
}
