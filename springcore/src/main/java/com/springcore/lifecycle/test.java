package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        AbstractApplicationContext ac= new ClassPathXmlApplicationContext("com/springcore/lifecycle/lcconfig.xml");
        // mango obj= (mango) ac.getBean("man");
        // System.out.println(obj);
        ac.registerShutdownHook();
        // System.out.println(".........................");
        // juice j= (juice) ac.getBean("ju");
        // System.out.println(j);
        example e= (example) ac.getBean("ex");
        System.out.println(e);
    }
}
