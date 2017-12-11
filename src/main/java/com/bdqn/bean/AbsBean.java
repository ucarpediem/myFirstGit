package com.bdqn.bean;

public class AbsBean {
	
	private Integer number;
	
	private  String son;
	
	public String getSon() {
		return son;
	}

	public void setSon(String son) {
		this.son = son;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	@Override
	public String toString() {
		return "AbsBean [number=" + number + ", son=" + son + "]";
	}
	
	
	
	
}
