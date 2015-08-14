package com.example.test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
  
public class Test {  
public static void main(String[] args) {  
	// Using BeanFactory 
    //Resource resource=new ClassPathResource("applicationcontext.xml");  
    
    // Using ApplicatipnContext
    ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
    
    //BeanFactory factory=new XmlBeanFactory(resource);  
      
    Student student=(Student)context.getBean("studentbean");  
    student.displayInfo();  
}  
} 