package com.cyclone.test;

import com.cyclone.bean.Sample;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
        Sample s1 = (Sample) context.getBean("obj1");
        System.out.println(s1);
        Sample s2 = (Sample) context.getBean("obj2");
        System.out.println(s2);
        context.close();
    }
}
