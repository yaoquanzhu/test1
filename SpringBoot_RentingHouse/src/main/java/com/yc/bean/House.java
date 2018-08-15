package com.yc.bean;

import java.io.Serializable;
import java.util.Date;

public class House implements Serializable {

	
	private static final long serialVersionUID = -474214978059639576L;
	
	private Integer id;
	private User user;
	private Integer user_id;
	private HouseType type;
	private Integer type_id;
	private String title;
	private String description;
	private Double price;
	private Date pubdate;
	private Integer floorage;
	private String contact;
	private Street street;
	private Integer street_id;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public HouseType getType() {
		return type;
	}
	public void setType(HouseType type) {
		this.type = type;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Date getPubdate() {
		return pubdate;
	}
	public void setPubdate(Date pubdate) {
		this.pubdate = pubdate;
	}
	public Integer getFloorage() {
		return floorage;
	}
	public void setFloorage(Integer floorage) {
		this.floorage = floorage;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public Street getStreet() {
		return street;
	}
	public void setStreet(Street street) {
		this.street = street;
	}
	public House() {
		super();
	}

	
	public House(Integer id, User user, Integer user_id, HouseType type,
			Integer type_id, String title, String description, Double price,
			Date pubdate, Integer floorage, String contact, Street street,
			Integer street_id) {
		super();
		this.id = id;
		this.user = user;
		this.user_id = user_id;
		this.type = type;
		this.type_id = type_id;
		this.title = title;
		this.description = description;
		this.price = price;
		this.pubdate = pubdate;
		this.floorage = floorage;
		this.contact = contact;
		this.street = street;
		this.street_id = street_id;
	}
	public Integer getUser_id() {
		return user_id;
	}
	public void setUser_id(Integer user_id) {
		this.user_id = user_id;
	}
	public Integer getType_id() {
		return type_id;
	}
	public void setType_id(Integer type_id) {
		this.type_id = type_id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getStreet_id() {
		return street_id;
	}
	public void setStreet_id(Integer street_id) {
		this.street_id = street_id;
	}
	@Override
	public String toString() {
		return "House [id=" + id + ", user=" + user + ", user_id=" + user_id
				+ ", type=" + type + ", type_id=" + type_id + ", title="
				+ title + ", description=" + description + ", price=" + price
				+ ", pubdate=" + pubdate + ", floorage=" + floorage
				+ ", contact=" + contact + ", street=" + street
				+ ", street_id=" + street_id + "]\n";
	}
	

}
