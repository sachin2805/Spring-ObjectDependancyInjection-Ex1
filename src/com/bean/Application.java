package com.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {

	public static void main(String[] args) {
		try{
			ApplicationContext c= 
					new ClassPathXmlApplicationContext("spring.xml");
			Employee emp=(Employee) c.getBean("e1");

			emp.display();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}
}

/*OUTPUT :
Name : Sachin
Designation : Devloper
Joining Date : 28/5/2021
Salary : 70000.0
*/