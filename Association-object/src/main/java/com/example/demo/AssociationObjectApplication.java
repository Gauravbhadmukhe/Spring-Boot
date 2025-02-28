package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class AssociationObjectApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(AssociationObjectApplication.class, args);

        Address a = context.getBean(Address.class);
        a=new Address("Pune","MH",422401);

        Employee e1 = context.getBean(Employee.class);
        Employee e2 = context.getBean(Employee.class);
        
        e1=new Employee(101,"Raj",a);
        e2=new Employee(102,"Anvit",a);

       
        System.out.println(e1);
        System.out.println(e2);
    }
}
