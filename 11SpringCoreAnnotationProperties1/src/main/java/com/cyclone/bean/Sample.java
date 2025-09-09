package com.cyclone.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("smpl")
public class Sample {

    @Value("${emp.name}")
    String name;

    @Value("${emp.roll}")
    String roll;

    @Value("${emp.dept}")
    String dept;

    @Value("${emp.year}")
    String year;

    @Override
    public String toString() {
        return "Sample{" +
                "name='" + name + '\'' +
                ", roll='" + roll + '\'' +
                ", dept='" + dept + '\'' +
                ", year='" + year + '\'' +
                '}';
    }
}
