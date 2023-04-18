package org.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CollectionDemoMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("CollectionConfig.xml");
        Employee employee = (Employee) applicationContext.getBean("employee");
        System.out.println(employee.getEmpName());
        System.out.println(employee.getAddresses());
        System.out.println(employee.getPhone());
        System.out.println(employee.getCourses());

    }
}
