package com.topyfi.model;

import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity(name = "NORMAL_USER")
public class NormalUser extends RandomUser {
/*	@Id @GeneratedValue
	private int userId;*/
	private String name;
	private String lastName;
	private int phoneNumber;
	private ArrayList<Integer> resolutionsIDList = new ArrayList<Integer>();
	@OneToOne(cascade = {CascadeType.ALL})
	private Address address;

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public ArrayList<Integer> getResolutionsIDList() {
		return resolutionsIDList;
	}

	public void setResolutionsIDList(ArrayList<Integer> resolutionsIDList) {
		this.resolutionsIDList = resolutionsIDList;
	}
	
	@Override
	public String toString(){
		return "Name: " + name + " | Last Name: " + lastName + " | Phone Number: " + phoneNumber + "\n";
	}

}
