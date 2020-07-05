package com.example.demo.spring.bean;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import java.util.HashMap;
import java.util.Map;

@SpringBootTest
public class SomeBeanTest {

    @Autowired
    ApplicationContext context;

    @Autowired
    WrapperBeanOne wrapperBeanOne;
    @Autowired
    WrapperBeanTwo wrapperBeanTwo;

    @Test
    @DisplayName("Bean scope 테스트")
    public void prototypeBean() {
        SomeBean someBean1 = context.getBean("someBean", SomeBean.class);
        SomeBean someBean2 = context.getBean("someBean", SomeBean.class);
        System.out.println("someBean : " + someBean1 + ", " + someBean2);
        Assertions.assertNotEquals(someBean1, someBean2);

        someBean1.setName("hihi");
        System.out.println("someBean : " + someBean1.getName() + ", " + someBean2.getName());
        Assertions.assertNotEquals(someBean1.getName(), someBean2.getName());

        Assertions.assertNotEquals(someBean1, someBean2);
    }

    @Test
    @DisplayName("prototype Bean 주입 받은 Bean 테스트")
    public void beanScope() {
        // SomeBean 빈 scope 를 prototype 으로 주었다.
        // WrapperBean 은 계속 싱글톤이 반환됨.
        SomeBean someBean1 = this.wrapperBeanOne.getWrapperBean().getSomeBean();
        SomeBean someBean2 = this.wrapperBeanTwo.getWrapperBean().getSomeBean();
        System.out.println("someBean : " + someBean1 + ", " + someBean2);
        Assertions.assertEquals(someBean1, someBean2);

        someBean1.setName("hihi");
        System.out.println("someBean : " + someBean1.getName() + ", " + someBean2.getName());
        Assertions.assertEquals(someBean1.getName(), someBean2.getName());

        WrapperBeanOne wrapperBeanOne = BeanUtil.getBean(WrapperBeanOne.class);
        WrapperBeanTwo wrapperBeanTwo = BeanUtil.getBean(WrapperBeanTwo.class);
        Assertions.assertEquals(wrapperBeanOne.getWrapperBean().getSomeBean(), wrapperBeanTwo.getWrapperBean().getSomeBean());
    }

    @Test
    @DisplayName("proxy-mode")
    public void equals_proxy_target_class_bean() {
        SomeBean someBean1 = wrapperBeanOne.getWrapperBean().getSomeBean2();
        SomeBean someBean2 = wrapperBeanTwo.getWrapperBean().getSomeBean2();
        System.out.println("someBean : " + someBean1 + ", " + someBean2);
        Assertions.assertEquals(someBean1, someBean2); // 왜 같은걸까..?

        someBean1.setName("hihi");
        System.out.println("someBean1 : " + someBean1.getName() + ", " + someBean2.getName());
        Assertions.assertEquals(someBean1, someBean2);

        WrapperBeanOne wrapperBeanOne = BeanUtil.getBean(WrapperBeanOne.class);
        WrapperBeanTwo wrapperBeanTwo = BeanUtil.getBean(WrapperBeanTwo.class);

        SomeBean someBean11 = wrapperBeanOne.getWrapperBean().getSomeBean2();
        SomeBean someBean22 = wrapperBeanTwo.getWrapperBean().getSomeBean2();
        Map<SomeBean, Object> map = new HashMap<>();
        map.put(someBean11, "hi 1");
        map.put(someBean22, "hi 2");
        Assertions.assertEquals(1, map.size());

        System.out.println("hashCode " + someBean11.hashCode() + ", " + someBean22.hashCode());
        Assertions.assertSame(someBean11, someBean22);
    }
}
