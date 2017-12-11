package com.bdqn.test;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDataSource {
	
	
	
	@Test
	public void m1() {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("dataSource.xml");
		 DataSource s = (DataSource)ctx.getBean("dataSource");
		 try {
			System.out.println(s.getConnection().getMetaData().getDatabaseProductName()+
					 s.getConnection().getMetaData().getDatabaseProductVersion());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
