package com.cyclone.bean;

import com.cyclone.sample.Sample;

public class Bean {
    Sample sample;

    public Sample getSample() {
        return sample;
    }

    public void setSample(Sample sample) {
        this.sample = sample;
    }

    public Bean() {
        super();
    }

    public Bean(Sample sample) {
        this.sample = sample;
    }

    @Override
    public String toString() {
        return "Bean{" +
                "sample=" + sample +
                '}';
    }
}
