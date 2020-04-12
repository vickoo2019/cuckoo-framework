package com.cuckoo.app;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RunMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("application.xml");
        System.out.println(applicationContext.getBean("a"));
        applicationContext.start();
    }
}
