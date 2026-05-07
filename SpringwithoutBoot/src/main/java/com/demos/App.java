package com.demos;

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
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Dev obj = (Dev) context.getBean("dev");// = new Dev();
        obj.build();
        //obj.setAge(10);
        System.out.println( "Hello World!" );
       // System.out.println( obj.getAge());

    }
}
