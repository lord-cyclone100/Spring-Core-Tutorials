package com.cyclone.app.bean.stuff;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("beanObj")
public class Bean {

    @Value("Developer")
    String post;

    @Value("50000.56")
    double salary;

    @Override
    public String toString() {
        return "Bean{" +
                "post='" + post + '\'' +
                ", salary=" + salary +
                '}';
    }
}
