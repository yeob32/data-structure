package com.example.demo.spring.bean;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SomeBeanTest {

    @Autowired
    WrapperBeanOne wrapperBeanOne;
    @Autowired
    WrapperBeanTwo wrapperBeanTwo;

    @Test
    @DisplayName("Bean scope 테스트")
    public void prototypeBean() {
        SomeBean someBean1 = BeanUtil.getBean(SomeBean.class);
        SomeBean someBean2 = BeanUtil.getBean(SomeBean.class);

        Assertions.assertNotEquals(someBean1, someBean2);
    }

    @Test
    @DisplayName("prototype Bean 주입 받은 Bean 테스트")
    public void beanScope() {
        // SomeBean 빈 scope 를 prototype 으로 주었다.
        // WrapperBean 은 계속 싱글톤이 반환됨.
        Assertions.assertEquals(this.wrapperBeanOne.getWrapperBean(), this.wrapperBeanTwo.getWrapperBean());

        WrapperBeanOne wrapperBeanOne = BeanUtil.getBean(WrapperBeanOne.class);
        WrapperBeanTwo wrapperBeanTwo = BeanUtil.getBean(WrapperBeanTwo.class);

        Assertions.assertEquals(wrapperBeanOne.getWrapperBean(), wrapperBeanTwo.getWrapperBean());
    }
}
