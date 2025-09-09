package com.cyclone.test;

import com.cyclone.bean.Sample;
import com.cyclone.config.MyApp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext ac = new AnnotationConfigApplicationContext(MyApp.class);

        Sample s = ac.getBean("smpl", Sample.class);
        System.out.println(s);
    }
}
