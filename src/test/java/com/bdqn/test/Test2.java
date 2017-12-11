package com.bdqn.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bdqn.bean.AbsBean;
import com.bdqn.bean.Blog;
import com.bdqn.bean.Comment;
import com.bdqn.bean.Student;

public class Test2 {
	
	@Test
	public void m1() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		Blog blog = (Blog)ctx.getBean("blog");
		Blog blog2 = (Blog)ctx.getBean("blog2");
		System.out.println(blog2.getComment().getContent());
		
	}
	@Test
	public void m2() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		Blog blog = (Blog)ctx.getBean("blog");
		Comment blog2 = (Comment)ctx.getBean("comment2");
		Comment blog3 = (Comment)ctx.getBean("comment2");
		System.out.println(blog2.getContent());
		System.out.println(blog2==blog3);
	}
	@Test
	public void m3() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		Comment blog2 = (Comment)ctx.getBean("comment3");
		Comment blog3 = (Comment)ctx.getBean("comment3");
		System.out.println(blog2==blog3);
	}
	@Test
	public void m4() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		AbsBean a = (AbsBean)ctx.getBean("absBean2");
		AbsBean b = (AbsBean)ctx.getBean("baseBean");
		System.out.println(b);
	}
	@Test
	public void m5() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		Student s = (Student)ctx.getBean("student");
		System.out.println(s);
	
	}
	@Test
	public void m6() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		Student s = (Student)ctx.getBean("student2");
		System.out.println(s);
		
	}
	@Test
	public void m7() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		Student s = (Student)ctx.getBean("student3");
		System.out.println(s);
		
	}
	@Test
	public void m8() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		Student s = (Student)ctx.getBean("student4");
		System.out.println(s);
		
	}
	
}
