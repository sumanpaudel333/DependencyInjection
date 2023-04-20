package org.standalonecollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PersonMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("standaloneconfig.xml");
        Person person=(Person) applicationContext.getBean("person2");
        System.out.println(person);
    }
}
