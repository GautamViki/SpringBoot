package com.practice1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//        A aObj = ctx.getBean("a1", A.class);
//        aObj.funA();
        B bObj = ctx.getBean("b1", B.class);
        bObj.funB();
    }
}
