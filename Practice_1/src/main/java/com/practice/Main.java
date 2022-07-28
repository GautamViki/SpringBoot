package com.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
//        MyBusinessClass myBusinessClass=ctx.getBean(MyBusinessClass.class,"pr1");
//        myBusinessClass.fun1();
            Travel t=ctx.getBean(Travel.class,"t");
            t.journey();
    }
}
