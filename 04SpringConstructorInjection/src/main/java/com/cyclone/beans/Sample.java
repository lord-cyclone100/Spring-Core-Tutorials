package com.cyclone.beans;

public class Sample {
    private int id;
    private String name;
    private double salary;

    public Sample(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Sample{" +
                "id=" + this.id +
                ", name='" + this.name + '\'' +
                ", salary=" + this.salary +
                '}';
    }
}
