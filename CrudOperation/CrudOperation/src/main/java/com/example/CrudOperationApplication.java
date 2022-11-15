package com.example;

import com.example.model.Student;
import com.example.repository.StudentRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Optional;

@SpringBootApplication
public class CrudOperationApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(CrudOperationApplication.class, args);
        StudentRepo student = context.getBean(StudentRepo.class);

        Student std = new Student();
        std.setAddress("Lucknow");
        std.setName("Vikas");

        Student std2 = new Student();
        std2.setName("Brijesh");
        std2.setAddress("Kanpur");
//        Student student2 = student.save(std2);
//        Student student1 = student.save(std);
//        System.out.println(student1 + "  " + student2);
        Optional<Student> opt = student.findById(2);
        System.out.println(opt);

        System.out.println("hello vikas");
    }

}
