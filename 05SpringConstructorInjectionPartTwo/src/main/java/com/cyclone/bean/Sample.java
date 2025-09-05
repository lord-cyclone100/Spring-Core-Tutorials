package com.cyclone.bean;

import java.util.Date;

public class Sample {
    private Date date;

    public Sample(Date date){
        this.date = date;
    }

    public void wishUser(String name) {
        int hours = date.getHours();
        if(hours >= 0 && hours < 12){
            System.out.println("Good Morning "+name);
        }
        else if(hours >= 12 && hours < 16){
            System.out.println("Good Afternoon "+name);
        }
        else if(hours >= 16 && hours < 20){
            System.out.println("Good Evening "+name);
        }
        else{
            System.out.println("Good Night "+name);
        }
    }
}
