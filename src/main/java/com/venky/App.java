package com.venky;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("spconfig.xml");
        EmployeeInvoiceBean ab=(EmployeeInvoiceBean)ctx.getBean("EIB");
       String s= ab.toString();
       System.out.println(s);
       ab.CalculateSalary();
       ab.printGrossSalary();
       ab.printNetSalary();
     
    }
}
