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
        
        Company company = new Company(employee);
        
        System.out.println("Object employee yang dicreate by code :"+ employee.toString());
        System.out.println("Object company yang dicreate by code :"+ company.toString());

        //with spring
        ApplicationContext appCtx = new ClassPathXmlApplicationContext("applicationContext.xml");
        
        Employee employeeBean = (Employee) appCtx.getBean("employee");
        Company companyBean = (Company) appCtx.getBean("company");

        System.out.println("Object employee yang dicreate by Spring :"+ employeeBean.toString());
        System.out.println("Object company yang dicreate by Spring :"+ companyBean.toString());

    }
}
