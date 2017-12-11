package com.bdqn.bean;

public class Wife {
	private Integer love;
	
	private String name;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getLove() {
		return love;
	}

	public void setLove(Integer love) {
		this.love = love;
	}

	@Override
	public String toString() {
		return "Wife [love=" + love + ", name=" + name + "]";
	}
	
	
	
	
}
