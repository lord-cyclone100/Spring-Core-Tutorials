package com.cyclone.test;

import com.cyclone.bean.JavaBean;
import com.cyclone.config.AppConfig;
import com.cyclone.sample.Sample;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
        JavaBean j = ac.getBean("jb", JavaBean.class);
        System.out.println(j);
        Sample s = ac.getBean("smp", Sample.class);
        System.out.println(s);
    }
}
