package org.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        Mapping a1 = context.getBean("map1",Mapping.class);
        for (Map.Entry m:a1.getTheMap().entrySet()){
            System.out.println();
            Student st=(Student) m.getKey();
            st.displayDetails();
            System.out.println("City name : "+m.getValue());
            System.out.println("===============================================");
        }

    }
}