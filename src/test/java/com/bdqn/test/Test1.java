package com.bdqn.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bdqn.bean.Author;
import com.bdqn.bean.HelloWorld;

public class Test1 {

	@Test
	public void m1() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		HelloWorld bean = (HelloWorld) ctx.getBean("helloWorld2");
		bean.say();
		((ClassPathXmlApplicationContext)ctx).close();
		
	}
	
	@Test
	public void m2() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		Author a = (Author)ctx.getBean("author");
		System.out.println(a);
		
	}
	@Test
	public void m3() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		Author bean = (Author)ctx.getBean("author2");
		Author bean2 = (Author)ctx.getBean("author3");
		Author a4 = (Author)ctx.getBean("author4");
		System.out.println(a4);
	}
	
	
	
	
}