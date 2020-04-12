package com.learning.spring;

import org.springframework.stereotype.Component;

@Component("lapt1")
public class Laptop
{
	private int lid;
	private String brand;
	
	public int getLid()
	{
		return lid;
	}
	public void setLid(int lid)
	{
		this.lid = lid;
	}
	public String getBrand()
	{
		return brand;
	}
	public void setBrand(String brand)
	{
		this.brand = brand;
	}
	
	@Override
	public String toString()
	{
		return "Laptop [lid=" + lid + ", brand=" + brand + "]";
	}		
}
