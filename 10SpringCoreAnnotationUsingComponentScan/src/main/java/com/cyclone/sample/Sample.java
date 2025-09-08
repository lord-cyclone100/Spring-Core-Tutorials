package com.cyclone.sample;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("smp")
public class Sample {

    @Value("This is Sample")
    String type;

    @Override
    public String toString() {
        return "Sample{" +
                "type='" + type + '\'' +
                '}';
    }
}
