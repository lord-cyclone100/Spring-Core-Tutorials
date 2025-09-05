package com.cyclone.bean;

public class Sample {
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
        System.out.println("Setter injection");
    }

    public Sample(int x) {
        this.x = x;
        System.out.println("Constructor injection");
    }
}
