package com.cyclone.test;

import com.cyclone.beans.Sample;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        Sample s1 = (Sample) context.getBean("obj1");
        System.out.println(s1);

        context.close();
    }
}
