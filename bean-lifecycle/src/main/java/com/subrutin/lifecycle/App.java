package com.subrutin.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        AbstractApplicationContext appCtx = new ClassPathXmlApplicationContext("applicationContext.xml");
        Employee employeeBean = (Employee) appCtx.getBean("employee");
        System.out.println("8 Object employee telah siap digunakan :"+ employeeBean.toString());
        appCtx.registerShutdownHook();
    }
}
