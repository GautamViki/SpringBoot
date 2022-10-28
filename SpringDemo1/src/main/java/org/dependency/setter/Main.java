package org.dependency.setter;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Student std = (Student) context.getBean("std2");
        System.out.println(std);
    }
}