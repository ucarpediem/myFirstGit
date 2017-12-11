package com.bdqn.bean;

public class Author {
	private Integer age;
	private String name;
	private Wife wife;
	
	
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

		
	
	public Author() {
	}
	public Wife getWife() {
		return wife;
	}
	public void setWife(Wife wife) {
		this.wife = wife;
	}
	
	public Author(Integer age, String name) {
		super();
		this.age = age;
		this.name = name;
	}
	public Author(Integer age, String name, Wife wife) {
		super();
		this.age = age;
		this.name = name;
		this.wife = wife;
	}
	@Override
	public String toString() {
		return "Author [age=" + age + ", name=" + name + ", wife=" + wife + "]";
	}

	
	
	
}
