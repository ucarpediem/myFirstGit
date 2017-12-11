package com.bdqn.bean;

public class HelloWorld {

	private String name;
	
	public void say() {
		System.out.println(name);
	}

	
	
	public HelloWorld() {
		System.out.println("constructor.......");
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void init() {
		System.out.println("init....");
	}
	
	public void die() {
		System.out.println("destroyed.....");
	}
}

