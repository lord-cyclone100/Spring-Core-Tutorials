package com.cyclone.bean;

public class Sample {
    private double d1,d2;

    public Sample(int d1, int d2){
        this.d1 = d1;
        this.d2 = d2;
        System.out.println("int - int constructor called");
    }

    public Sample(double d1, double d2){
        this.d1 = d1;
        this.d2 = d2;
        System.out.println("double - double constructor called");
    }

    @Override
    public String toString() {
        return "Sum of "+d1+" and "+d2+" = "+(d1+d2);
    }
}
