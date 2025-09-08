package com.cyclone.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
        ac.scan("com.cyclone.app");
        ac.refresh();

        Sample s = ac.getBean("obj1", Sample.class);
        System.out.println(s);
    }
}
