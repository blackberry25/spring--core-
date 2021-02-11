package com.springcore.standalone.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {
    private List<String> friends;
    private Map<String,Long>salary;
    private Properties prop;

    public Person() {
    }

    public List<String> getFriends() {
        return friends;
    }

    public void setFriends(List<String> friends) {
        this.friends = friends;
    }

    public Map<String, Long> getSalary() {
        return salary;
    }

    public void setSalary(Map<String, Long> salary) {
        this.salary = salary;
    }

   

    public Properties getProp() {
        return prop;
    }

    public void setProp(Properties prop) {
        this.prop = prop;
    }

    @Override
    public String toString() {
        return "Person [friends=" + friends + ", prop=" + prop + ", salary=" + salary + "]";
    }

    

   
}
