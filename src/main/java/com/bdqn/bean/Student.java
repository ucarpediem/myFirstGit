package com.bdqn.bean;

import java.util.List;
import java.util.Map;

public class Student {
	
	private Integer age;
	
	private String name;
	private List<String> books;
	private List<ItBook> itbooks;
	private Map<String, Object> games;
	
	private List<Map<String, Girl>> listMapGirls;
	
	public List<Map<String, Girl>> getListMapGirls() {
		return listMapGirls;
	}
	public void setListMapGirls(List<Map<String, Girl>> listMapGirls) {
		this.listMapGirls = listMapGirls;
	}
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
	public List<String> getBooks() {
		return books;
	}
	public void setBooks(List<String> books) {
		this.books = books;
	}
	
	public Map<String, Object> getGames() {
		return games;
	}
	public void setGames(Map<String, Object> games) {
		this.games = games;
	}

	public List<ItBook> getItbooks() {
		return itbooks;
	}
	public void setItbooks(List<ItBook> itbooks) {
		this.itbooks = itbooks;
	}
	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + ", books=" + books + ", itbooks=" + itbooks + ", games="
				+ games + ", listMapGirls=" + listMapGirls + "]";
	}
	
	
	
}
