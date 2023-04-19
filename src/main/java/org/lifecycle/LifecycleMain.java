package org.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifecycleMain {
    public static void main(String[] args) {
        AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext("LifecycleConfig.xml");
        //Registering Shutdown Hook to call delete() method
        applicationContext.registerShutdownHook();

        /*MovieTicket movieTicket = (MovieTicket) applicationContext.getBean("movieTicket");

        AirlinesTicket airlinesTicket = (AirlinesTicket) applicationContext.getBean("airlinesTicket");
        System.out.println(movieTicket);
        System.out.println(airlinesTicket);*/
        EventTicket eventTicket= (EventTicket ) applicationContext.getBean("eventTicket");
        System.out.println(eventTicket);
    }
}
