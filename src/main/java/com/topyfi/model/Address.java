package com.topyfi.model;

public class Address {
	/* i assume that the apartmentNumb and buildingNumb are numbers */
	private String streetName;
	private int buildingNumb;
	private int apartmentNumb;
	private int postalCode;
	private String city;
	private String country;

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public int getBuildingNumb() {
		return buildingNumb;
	}

	public void setBuildingNumb(int buildingNumb) {
		this.buildingNumb = buildingNumb;
	}

	public int getApartmentNumb() {
		return apartmentNumb;
	}

	public void setApartmentNumb(int apartmentNumb) {
		this.apartmentNumb = apartmentNumb;
	}

	public int getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

}
