package com.coolweather.app.model;

public class Country {
	private int id;
	private String countryName;
	private String countryCode;
	private int cityId;
	
	public int getId()
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public String getCountryName()
	{
		return countryName;
	}
	
	public void setCountryName(String name)
	{
		this.countryName = name;
	}

	public String getCountryCode()
	{
		return countryCode;
	}
	
	public void setCountryCode(String code)
	{
		this.countryCode = code;
	}
	
	public int getCityId()
	{
		return cityId;
	}
	
	public void setCityId(int id)
	{
		this.cityId = id;
	}

}
