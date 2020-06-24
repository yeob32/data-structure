package com.example.demo.spring.bean;

import org.springframework.stereotype.Component;

@Component
public class WrapperBeanOne {

    private final WrapperBean wrapperBean;

    public WrapperBeanOne(WrapperBean wrapperBean) {
        this.wrapperBean = wrapperBean;
    }

    public WrapperBean getWrapperBean() {
        return wrapperBean;
    }
}
