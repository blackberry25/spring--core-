package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoconfig.xml");
        Person p= (Person) ac.getBean("ob");
        System.out.println(p);
        Person p1=ac.getBean("ob",Person.class);
        // without using scope object will be singleton means single object given by both time go check into person file
        System.out.println(p.hashCode());
        System.out.println(p1.hashCode());
        System.out.println(".............");
        Animal a=ac.getBean("an",Animal.class);
        Animal a1=ac.getBean("an",Animal.class);
        System.out.println(a.hashCode());
        System.out.println(a1.hashCode());
        
    }

    
}
