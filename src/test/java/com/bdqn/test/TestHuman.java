package com.bdqn.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bdqn.bean.Human;

public class TestHuman {

	@Test
	public void m1() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("human.xml");
		Human h = (Human)ctx.getBean("human");
		System.out.println(h);
		
	}
	@Test
	public void m2() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("human.xml");
		Human h = (Human)ctx.getBean("human2");
		System.out.println(h);
		
	}
	@Test
	public void m3() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("human.xml");
		Human h = (Human)ctx.getBean("human3");
		System.out.println(h);
		
	}
	@Test
	public void m4() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("human.xml");
		Human h = (Human)ctx.getBean("human4");
		System.out.println(h);
		
	}
	@Test
	public void m5() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("human.xml");
		Human h = (Human)ctx.getBean("human5");
		System.out.println(h);
		
	}
	@Test
	public void m6() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("human.xml");
		Human h = (Human)ctx.getBean("human6");
		System.out.println(h);
		
	}
	
	
	
}
