package com.software.entity;

import java.sql.Timestamp;

public class Record {
	private int id;
	private int user_id;
	private int car_id;
	private Timestamp start_date;
	private Timestamp return_date;
	private double payment;

	public Record() {
		super();
	}

	public Record(int id, int user_id, int car_id, Timestamp start_date, Timestamp return_date, double payment) {
		super();
		this.id = id;
		this.user_id = user_id;
		this.car_id = car_id;
		this.start_date = start_date;
		this.return_date = return_date;
		this.payment = payment;
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

	@Override
	public String toString() {
		return "Record [id=" + id + ", user_id=" + user_id + ", car_id=" + car_id + ", start_date=" + start_date
				+ ", return_date=" + return_date + ", payment=" + payment + "]";
	}

}
