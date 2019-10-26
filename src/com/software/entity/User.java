package com.software.entity;

/**
 * 
 * @author Kaizuka-Inaho
 *
 */

public class User {
	private int id;
	private String username;
	private String password;
	private int sex;
	private String idnumber;
	private String tel;
	private String addr;
	private int type;

	public User() {
		super();
	}

	public User(int id, String username, String password, int sex, String idnumber, String tel, String addr, int type) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.sex = sex;
		this.idnumber = idnumber;
		this.tel = tel;
		this.addr = addr;
		this.type = type;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getSex() {
		return sex;
	}

	public void setSex(int sex) {
		this.sex = sex;
	}

	public String getIdnumber() {
		return idnumber;
	}

	public void setIdnumber(String idnumber) {
		this.idnumber = idnumber;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + ", sex=" + sex + ", idnumber="
				+ idnumber + ", tel=" + tel + ", addr=" + addr + ", type=" + type + "]";
	}

}
