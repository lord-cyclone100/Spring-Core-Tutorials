package com.cyclone.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("obj1")
public class Sample {

    @Value("Sangneel")
    String userName;

    @Value("22")
    int age;

    @Override
    public String toString() {
        return "Sample{" +
                "userName='" + userName + '\'' +
                ", age=" + age +
                '}';
    }
}
