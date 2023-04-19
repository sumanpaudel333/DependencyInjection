package org.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWireMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("autoconfig.xml");
        Employee employee=applicationContext.getBean("employee2", Employee.class);
        Employee employee1=applicationContext.getBean("employee3", Employee.class);
        Employee employee2=applicationContext.getBean("employee4", Employee.class);

        // Employee.class automatically returns typeCasted value no need to further typecast
        System.out.println(employee);
        System.out.println(employee1);
        System.out.println(employee2);
    }
}
