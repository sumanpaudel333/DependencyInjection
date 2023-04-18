package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("config.xml");
        Student student= (Student) applicationContext.getBean("Student");
        System.out.println(student);
        Student student1= (Student) applicationContext.getBean("Student1");
        System.out.println(student1);
    }
}
