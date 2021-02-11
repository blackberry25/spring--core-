package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.SystemPropertyUtils;

public class test {
    public static void main(String[] args) {
        ApplicationContext ap=new ClassPathXmlApplicationContext("com/springcore/ref/refconfig.xml");
        A obj=(A) ap.getBean("aref");
        System.out.println(obj.getX());
        System.out.println(obj.getOb());
    }
}
