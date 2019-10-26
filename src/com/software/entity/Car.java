
package com.software.entity;

/**
 * 
 * @author 作者: 007
 * 
 * @version 创建时间：2019年5月13日 下午3:47:29
 * 
 *          类说明
 * 
 */

public class Car {
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
	private String useable;

	public Car() {
		super();
	}

	public Car(int id, String carNumber, long brand_id, String model, String color, long category_id, String t_comments,
			double price, int rent, String status, String useable) {
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
		this.useable = useable;
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

	public String getUseable() {
		return useable;
	}

	public void setUseable(String useable) {
		this.useable = useable;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", carNumber=" + carNumber + ", brand_id=" + brand_id + ", model=" + model + ", color="
				+ color + ", category_id=" + category_id + ", t_comments=" + t_comments + ", price=" + price + ", rent="
				+ rent + ", status=" + status + ", useable=" + useable + "]";
	}

	
}
