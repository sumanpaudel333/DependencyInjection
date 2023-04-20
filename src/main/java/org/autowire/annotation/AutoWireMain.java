package org.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWireMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("autoannotationconfig.xml");
        Employee employee = applicationContext.getBean("employee", Employee.class);
        Employee employee1 = applicationContext.getBean("employee", Employee.class);
        // Employee.class automatically returns typeCasted value no need to further typecast
        employee.setName("Suman");
        // Both returns same while bean scope of employee is singleton but
        // second one returns null when bean scope of employee is set to prototype
        System.out.println(employee.getName());
        System.out.println(employee1.getName());
        System.out.println(employee);
    }
}
