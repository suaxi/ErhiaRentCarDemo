package com.software.entity;

import java.sql.Timestamp;

public class RentalCar {
	private int id;
	private String carNumber;
	private long brand_id;
	private String model;
	private String color;
	private long category_id;
	private String t_comments;
	private double price;
	private int rent;
	private String status;
	private String brand_name;
	private String useable;
	private String category_name;
	private Timestamp start_date;
	private Timestamp return_date;
	private double payment;
	private int car_id;

	public RentalCar() {
		super();
	}

	public RentalCar(int id, String carNumber, long brand_id, String model, String color, long category_id,
			String t_comments, double price, int rent, String status, String brand_name, String useable,
			String category_name, Timestamp start_date, Timestamp return_date, double payment, int car_id) {
		super();
		this.id = id;
		this.carNumber = carNumber;
		this.brand_id = brand_id;
		this.model = model;
		this.color = color;
		this.category_id = category_id;
		this.t_comments = t_comments;
		this.price = price;
		this.rent = rent;
		this.status = status;
		this.brand_name = brand_name;
		this.useable = useable;
		this.category_name = category_name;
		this.start_date = start_date;
		this.return_date = return_date;
		this.payment = payment;
		this.car_id = car_id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public long getBrand_id() {
		return brand_id;
	}

	public void setBrand_id(long brand_id) {
		this.brand_id = brand_id;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public long getCategory_id() {
		return category_id;
	}

	public void setCategory_id(long category_id) {
		this.category_id = category_id;
	}

	public String getT_comments() {
		return t_comments;
	}

	public void setT_comments(String t_comments) {
		this.t_comments = t_comments;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getRent() {
		return rent;
	}

	public void setRent(int rent) {
		this.rent = rent;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getBrand_name() {
		return brand_name;
	}

	public void setBrand_name(String brand_name) {
		this.brand_name = brand_name;
	}

	public String getUseable() {
		return useable;
	}

	public void setUseable(String useable) {
		this.useable = useable;
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

	public Timestamp getReturn_date() {
		return return_date;
	}

	public void setReturn_date(Timestamp return_date) {
		this.return_date = return_date;
	}

	public double getPayment() {
		return payment;
	}

	public void setPayment(double payment) {
		this.payment = payment;
	}

	public int getCar_id() {
		return car_id;
	}

	public void setCar_id(int car_id) {
		this.car_id = car_id;
	}

	@Override
	public String toString() {
		return "RentalCar [id=" + id + ", carNumber=" + carNumber + ", brand_id=" + brand_id + ", model=" + model
				+ ", color=" + color + ", category_id=" + category_id + ", t_comments=" + t_comments + ", price="
				+ price + ", rent=" + rent + ", status=" + status + ", brand_name=" + brand_name + ", useable="
				+ useable + ", category_name=" + category_name + ", start_date=" + start_date + ", return_date="
				+ return_date + ", payment=" + payment + ", car_id=" + car_id + "]";
	}

	

}