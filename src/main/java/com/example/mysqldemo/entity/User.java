package com.example.mysqldemo.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

@Entity
public class User {
	@Id
	@GeneratedValue
	private Integer id;
	@NotNull
	@NotBlank
	private String name;
	private Date dob;

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		if (dob.compareTo(new Date()) < 0) {
			throw new IllegalArgumentException("DOB cannot be future date");
		}
		this.dob = dob;
	}

	//
//	email;
	private long phoneNumber;

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
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
}
