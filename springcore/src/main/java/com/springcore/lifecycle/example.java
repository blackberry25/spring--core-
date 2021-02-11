package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class example {
    private String subject;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public example(String subject) {
        this.subject = subject;
    }

    public example() {
    }

    @Override
    public String toString() {
        return "example [subject=" + subject + "]";
    }
    @PostConstruct
    void start(){
        System.out.println("Starting or can say initialising....");
    }
    @PreDestroy
    void end(){
        System.out.println("ending it.....");
    }
    
}
