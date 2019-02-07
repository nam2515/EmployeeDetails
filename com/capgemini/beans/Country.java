package com.capgemini.beans;

public class Country {
	
	private String countryName;
	City cityName;
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public City getCityName() {
		return cityName;
	}
	public void setCityName(City cityName) {
		this.cityName = cityName;
	}
	@Override
	public String toString() {
		return "country = " + countryName + ", " + cityName ;
	}

}
