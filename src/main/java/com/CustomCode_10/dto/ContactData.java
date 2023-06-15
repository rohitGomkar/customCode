package com.CustomCode_10.dto;

public class ContactData {
	private long id;
	private String firstname;
	private String lastname;
	private String city;
	private String email;
	private String mobile;
	private String leadsource;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getLeadsource() {
		return leadsource;
	}
	public void setLeadsource(String leadsource) {
		this.leadsource = leadsource;
	}
}
