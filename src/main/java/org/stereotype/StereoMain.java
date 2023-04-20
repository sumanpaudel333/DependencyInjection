package org.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StereoMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("stereoconfig.xml");
        StereoDemo stereoDemo=applicationContext.getBean("stereoDemo", StereoDemo.class);
        System.out.println(stereoDemo.hashCode());
        StereoDemo stereoDemo1=applicationContext.getBean("stereoDemo", StereoDemo.class);
        System.out.println(stereoDemo1.hashCode());

    }
}
