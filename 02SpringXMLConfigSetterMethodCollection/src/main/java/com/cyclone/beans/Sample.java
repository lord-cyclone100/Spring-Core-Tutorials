package com.cyclone.beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Sample {
    private String name;
    private List<String> phoneNumbers;
    private Set<String> address;
    private Map<String, String> courses;

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumbers(List<String> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public void setAddress(Set<String> address) {
        this.address = address;
    }

    public void setCourses(Map<String, String> courses) {
        this.courses = courses;
    }

    public String getName() {
        return name;
    }

    public List<String> getPhoneNumbers() {
        return phoneNumbers;
    }

    public Set<String> getAddress() {
        return address;
    }

    public Map<String, String> getCourses() {
        return courses;
    }

    @Override
    public String toString() {
        return "Sample{" +
                "name='" + name + '\'' +
                ", phoneNumbers=" + phoneNumbers +
                ", address=" + address +
                ", courses=" + courses +
                '}';
    }
}
