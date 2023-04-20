package org.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpExpressionMain {
    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("expressionconfig.xml");
        SpExpressionDemo spExpressionDemo=applicationContext.getBean("spExpressionDemo", SpExpressionDemo.class);
        System.out.println(spExpressionDemo);
    }
}
