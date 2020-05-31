package com.subrutin.halospring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        Employee employee = new Employee();
        employee.setId("1");
        employee.setFullName("Tedy Tri Saputro");
        employee.setAddress("Jalan Kusuma Bangsa");
        
        System.out.println("Object yang dicreate by code :"+ employee.toString());
        
        //with spring
        ApplicationContext appCtx = new ClassPathXmlApplicationContext("applicationContext.xml");
        Employee employeeBean = (Employee) appCtx.getBean("employee");
        System.out.println("Object yang dicreate by Spring :"+ employeeBean.toString());
    }
}
