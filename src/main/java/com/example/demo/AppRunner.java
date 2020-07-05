package com.example.demo;

import com.example.demo.spring.bean.SomeBean;
import com.example.demo.spring.bean.WrapperBean;
import com.example.demo.spring.bean.WrapperBeanOne;
import com.example.demo.spring.bean.WrapperBeanTwo;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

@Component
public class AppRunner implements ApplicationRunner {

    private final ApplicationContext context;

    public AppRunner(ApplicationContext context) {
        this.context = context;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(context.getBean("someBean", SomeBean.class));
        System.out.println(context.getBean("someBean", SomeBean.class));

        System.out.println(context.getBean("someBeanByTargetClass", SomeBean.class));
        System.out.println(context.getBean("someBeanByTargetClass", SomeBean.class));

        System.out.println(context.getBean("wrapperBean", WrapperBean.class).getSomeBean());
        System.out.println(context.getBean("wrapperBean", WrapperBean.class).getSomeBean());

        System.out.println(context.getBean("wrapperBean", WrapperBean.class).getSomeBean2());
        System.out.println(context.getBean("wrapperBean", WrapperBean.class).getSomeBean2());

        System.out.println(context.getBean("wrapperBean", WrapperBean.class).getSomeBean());
        System.out.println(context.getBean("wrapperBean", WrapperBean.class).getSomeBean());

        System.out.println(context.getBean("wrapperBean", WrapperBean.class).getSomeBean2());
        System.out.println(context.getBean("wrapperBean", WrapperBean.class).getSomeBean2());

        System.out.println(context.getBean("wrapperBeanOne", WrapperBeanOne.class).getWrapperBean().getSomeBean());
        System.out.println(context.getBean("wrapperBeanOne", WrapperBeanOne.class).getWrapperBean().getSomeBean());

        System.out.println(context.getBean("wrapperBeanTwo", WrapperBeanTwo.class).getWrapperBean().getSomeBean());
        System.out.println(context.getBean("wrapperBeanTwo", WrapperBeanTwo.class).getWrapperBean().getSomeBean());

        System.out.println(context.getBean("wrapperBeanOne", WrapperBeanOne.class).getWrapperBean().getSomeBean2());
        System.out.println(context.getBean("wrapperBeanOne", WrapperBeanOne.class).getWrapperBean().getSomeBean2());

        System.out.println(context.getBean("wrapperBeanTwo", WrapperBeanTwo.class).getWrapperBean().getSomeBean2());
        System.out.println(context.getBean("wrapperBeanTwo", WrapperBeanTwo.class).getWrapperBean().getSomeBean2());

        System.out.println("======================================");
    }
}
