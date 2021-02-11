package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("com/springcore/ci/ciconfig.xml");
        Person p=(Person) ac.getBean("person");
        System.out.println(p);
        Addition ad= (Addition) ac.getBean("ad");
        ad.DoSum();

    }
}
