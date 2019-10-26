package com.software.entity;

import java.sql.Timestamp;

public class AllRecord {
	private int id;
	private int user_id;
	private int car_id;
	private String model;
	private String userName;
	private int rent;
	private double payment;
	private String t_comments;
	private String brand_name;
	private String category_name;
	private Timestamp start_date;

	public AllRecord() {
		super();
	}

	public AllRecord(int id, int user_id, int car_id, String model, String userName, int rent, double payment,
			String t_comments, String brand_name, String category_name, Timestamp start_date) {
		super();
		this.id = id;
		this.user_id = user_id;
		this.car_id = car_id;
		this.model = model;
		this.userName = userName;
		this.rent = rent;
		this.payment = payment;
		this.t_comments = t_comments;
		this.brand_name = brand_name;
		this.category_name = category_name;
		this.start_date = start_date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public int getCar_id() {
		return car_id;
	}

	public void setCar_id(int car_id) {
		this.car_id = car_id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getRent() {
		return rent;
	}

	public void setRent(int rent) {
		this.rent = rent;
	}

	public double getPayment() {
		return payment;
	}

	public void setPayment(double payment) {
		this.payment = payment;
	}

	public String getT_comments() {
		return t_comments;
	}

	public void setT_comments(String t_comments) {
		this.t_comments = t_comments;
	}

	public String getBrand_name() {
		return brand_name;
	}

	public void setBrand_name(String brand_name) {
		this.brand_name = brand_name;
	}

	public String getCategory_name() {
		return category_name;
	}

	public void setCategory_name(String category_name) {
		this.category_name = category_name;
	}

	public Timestamp getStart_date() {
		return start_date;
	}

	public void setStart_date(Timestamp start_date) {
		this.start_date = start_date;
	}

	@Override
	public String toString() {
		return "AllRecord [id=" + id + ", user_id=" + user_id + ", car_id=" + car_id + ", model=" + model
				+ ", userName=" + userName + ", rent=" + rent + ", payment=" + payment + ", t_comments=" + t_comments
				+ ", brand_name=" + brand_name + ", category_name=" + category_name + ", start_date=" + start_date
				+ "]";
	}

}
