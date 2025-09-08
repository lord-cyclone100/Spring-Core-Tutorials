package com.cyclone.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("jb")
public class JavaBean {

    @Value("This is a java bean")
    String content;

    @Override
    public String toString() {
        return "JavaBean{" +
                "content='" + content + '\'' +
                '}';
    }
}
