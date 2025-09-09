package com.cyclone.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan("com.cyclone.bean")
@PropertySource("application.properties")
public class MyApp {

}
