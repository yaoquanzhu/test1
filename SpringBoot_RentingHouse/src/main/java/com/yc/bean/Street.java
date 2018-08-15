package com.yc.bean;

import java.io.Serializable;

public class Street implements Serializable {

	
	private static final long serialVersionUID = -8984712620606897814L;

	private Integer id;
	
	private String name;
	
	private Integer districtId;

	public Street(Integer id, String name, Integer districtId) {
		super();
		this.id = id;
		this.name = name;
		this.districtId = districtId;
	}

	public Street() {
		super();
	}

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

	public Integer getDistrictId() {
		return districtId;
	}

	public void setDistrictId(Integer districtId) {
		this.districtId = districtId;
	}

	@Override
	public String toString() {
		return "Street [id=" + id + ", name=" + name + ", districtId="
				+ districtId + "]";
	}
}
