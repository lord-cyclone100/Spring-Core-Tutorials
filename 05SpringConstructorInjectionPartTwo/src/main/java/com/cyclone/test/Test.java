package com.cyclone.test;

import com.cyclone.bean.Sample;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        Sample s = (Sample) context.getBean("obj1");
        s.wishUser("Rohan");
    }
}
