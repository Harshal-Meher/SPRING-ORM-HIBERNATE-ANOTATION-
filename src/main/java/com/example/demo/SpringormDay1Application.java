package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.modal.Student;
import com.example.demo.modal.StudentDao;

@SpringBootApplication
public class SpringormDay1Application {

	public static void main(String[] args) {

		System.out.println("Hello");
	ApplicationContext contax=new ClassPathXmlApplicationContext("applicationContax.xml");
	StudentDao st=contax.getBean("d",StudentDao.class);
	
	Student e=new Student("Ram","S");
	
	if(st.saveStu(e))
	{
		System.out.println("Data Inserted");
	}
	
	}

}
