package com.cyclone.beans;

public class Sample1 {
    private int id;
    private Sample2 s1;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Sample2 getS1() {
        return s1;
    }

    public void setS1(Sample2 s1) {
        this.s1 = s1;
    }

    @Override
    public String toString() {
        return "Sample1{" +
                "id=" + id +
                ", s1=" + s1 +
                '}';
    }
}
