package com.springcore.collections;

import javax.naming.Context;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.util.SocketUtils;

public class test {
    public static void main(String[] args) {
        ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/collections/collectionconfig.xml");
        Emp obj= (Emp) context.getBean("emp1");
        System.out.println(obj.getName());
        System.out.println(obj.getAddress());
        System.out.println(obj.getPhones());
        System.out.println(obj.getCourses());
        

    }
}
