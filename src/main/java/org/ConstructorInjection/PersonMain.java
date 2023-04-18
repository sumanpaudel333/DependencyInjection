package org.ConstructorInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("ConstructorInj.xml");
        Person person= (Person) applicationContext.getBean("person");
        System.out.println(person);
    }
}
