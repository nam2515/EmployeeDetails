package com.capgemini.beans;

public class City {
	

	private String cityName;

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	@Override
	public String toString() {
		return "city = " + cityName + " ";
	}

}
