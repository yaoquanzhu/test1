package com.yc.bean;

import java.io.Serializable;

public class District implements Serializable {

	
	private static final long serialVersionUID = 2357515085309895848L;
	
	private Integer id;
	
	private String name;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public District() {
		super();
	}

	public District(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "District [id=" + id + ", name=" + name + "]";
	}
	

}
