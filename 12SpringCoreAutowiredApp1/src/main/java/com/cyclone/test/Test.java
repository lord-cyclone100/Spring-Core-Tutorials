package com.cyclone.test;

import com.cyclone.bean.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("config.xml");
        Bean b = cpx.getBean("beanObj", Bean.class);
        System.out.println(b);
    }
}
