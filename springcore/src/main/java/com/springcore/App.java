package com.springcore;

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
        ApplicationContext context =  new ClassPathXmlApplicationContext("src/config.xml");
        Student student1 = (Student) context.getBean("student1");
        System.out.println(student1);
        System.out.println("hello");
  

// test are goint on boom 

    }
}
