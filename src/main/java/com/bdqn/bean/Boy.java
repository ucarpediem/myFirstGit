package com.bdqn.bean;

import java.util.List;

public class Boy {
	
	private String name;
	private String nationality;
	private List<String> phones;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	@Override
	public String toString() {
		return "Boy [name=" + name + ", nationality=" + nationality + ", phones=" + phones + "]";
	}
	
	
}
