package com.cyclone.test;

import com.cyclone.beans.Sample1;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        Sample1 s1 = (Sample1) context.getBean("obj2");
        System.out.println(s1.getId());
        System.out.println(s1.getS1().getS2());

        context.close();
    }
}
