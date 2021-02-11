package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        ApplicationContext ap= new ClassPathXmlApplicationContext("com/springcore/standalone/collections/aloneconfig.xml");
        Person obj= (Person) ap.getBean("p1");
        System.out.println(obj);
        System.out.println(obj.getFriends().getClass().getName());
        System.out.println(obj.getSalary().getClass().getName());
        System.out.println(obj.getProp().getClass().getName());
    }
}
