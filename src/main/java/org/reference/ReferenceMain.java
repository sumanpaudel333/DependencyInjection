package org.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ReferenceMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("ReferenceConfig.xml");
        ReferedClass referedClass = (ReferedClass) applicationContext.getBean("referedClass");
        ReferenceClass  referenceClass = (ReferenceClass) applicationContext.getBean("referenceClass");
        System.out.println(referedClass);
        System.out.println(referenceClass);
    }
}
