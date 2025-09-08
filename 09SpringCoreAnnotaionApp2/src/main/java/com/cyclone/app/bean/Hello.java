package com.cyclone.app.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("helloObj")
public class Hello {

    @Value("Sangneel")
    String name;

    @Value("22")
    int age;

    @Override
    public String toString() {
        return "Hello{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
