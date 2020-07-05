package com.example.demo.spring.bean;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class WrapperBean {

    private final SomeBean someBean;
    private final SomeBean someBean2;

    public WrapperBean(SomeBean someBean, @Qualifier(value = "someBeanByTargetClass") SomeBean someBean2) {
        this.someBean = someBean;
        this.someBean2 = someBean2;
    }

    public SomeBean getSomeBean() {
        return someBean;
    }

    public SomeBean getSomeBean2() {
        return someBean2;
    }
}
