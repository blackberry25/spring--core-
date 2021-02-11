package com.springcore.auto.wire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        ApplicationContext ap=new ClassPathXmlApplicationContext("com/springcore/auto/wire/annotation/awconfig.xml");
        Emp obj= (Emp) ap.getBean("em");
        System.out.println(obj);
    }
}
