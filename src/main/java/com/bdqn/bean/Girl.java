package com.bdqn.bean;

import java.util.List;

public class Girl {
	
	private Integer age;
	
	private List<String> hzps;

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public List<String> getHzps() {
		return hzps;
	}

	public void setHzps(List<String> hzps) {
		this.hzps = hzps;
	}

	@Override
	public String toString() {
		return "Girl [age=" + age + ", hzps=" + hzps + "]";
	}
	
	
	
}
