package com.fedorenko.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App{
    public static void main( String[] args ) {
        ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeans.xml");
        LecturesWorker worker = (LecturesWorker)context.getBean("worker");

        Student student = worker.getStudentsByID(1);
        System.out.println(student);
        student = worker.getStudentsByID(1);
        System.out.println(student);

    }
}
