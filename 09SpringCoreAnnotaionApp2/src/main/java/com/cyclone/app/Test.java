package com.cyclone.app;

import com.cyclone.app.bean.stuff.Bean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
        ac.scan("com.cyclone");
        ac.refresh();

        Bean b = ac.getBean("beanObj",Bean.class);

        System.out.println(b);
    }
}
