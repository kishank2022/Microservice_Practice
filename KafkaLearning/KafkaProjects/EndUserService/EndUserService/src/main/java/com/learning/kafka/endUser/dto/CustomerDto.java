package com.learning.kafka.endUser.dto;


public class CustomerDto {

	private int id;
	private String name;
	private String email;
	private String contact_no;
	public CustomerDto(int id, String name, String email, String contact_no) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.contact_no = contact_no;
	}
	public CustomerDto() {
		super();
	}
	@Override
	public String toString() {
		return "CustomerDto [id=" + id + ", name=" + name + ", email=" + email + ", contact_no=" + contact_no + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact_no() {
		return contact_no;
	}
	public void setContact_no(String contact_no) {
		this.contact_no = contact_no;
	}
	
	
}
