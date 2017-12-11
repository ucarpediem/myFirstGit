package com.bdqn.bean;

import java.util.List;
import java.util.Map;

public class Human {

	private String name;
	private Integer age;
	private List<String> friends;
	private List<Hobby> hobbies;
	private Map<String, Object> games;
	private List<Map<String, Object>> pets;
	private List<Map<String, Boy>> listMapGirl;
	
	
	
	public List<Map<String, Boy>> getListMapGirl() {
		return listMapGirl;
	}
	public void setListMapGirl(List<Map<String, Boy>> listMapGirl) {
		this.listMapGirl = listMapGirl;
	}
	public List<Map<String, Object>> getPets() {
		return pets;
	}
	public void setPets(List<Map<String, Object>> pets) {
		this.pets = pets;
	}
	public Map<String, Object> getGames() {
		return games;
	}
	public void setGames(Map<String, Object> games) {
		this.games = games;
	}
	public List<Hobby> getHobbies() {
		return hobbies;
	}
	public void setHobbies(List<Hobby> hobbies) {
		this.hobbies = hobbies;
	}
	public List<String> getFriends() {
		return friends;
	}
	public void setFriends(List<String> friends) {
		this.friends = friends;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Human [name=" + name + ", age=" + age + ", friends=" + friends + ", hobbies=" + hobbies + ", games="
				+ games + ", pets=" + pets + ", listMapGirl=" + listMapGirl + "]";
	}
	
	
	
	
}
