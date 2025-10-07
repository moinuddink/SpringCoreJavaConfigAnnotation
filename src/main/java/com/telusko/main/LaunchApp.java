package com.telusko.main;

import com.telusko.config.Config;
import com.telusko.config.Password;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LaunchApp {
    public static void main(String[] args) {


        ApplicationContext container = new AnnotationConfigApplicationContext(Config.class);//activate ioc container
     Password p =   container.getBean(Password.class);
        System.out.println();

    }
}
