package com.expample.demo.products;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProductData {
	
	String pName;
	String pMfgDate;
	String pExDate;
	Double price;
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public String getpMfgDate() {
		return pMfgDate;
	}
	public void setpMfgDate(String pMfgDate) {
		this.pMfgDate = pMfgDate;
	}
	public String getpExDate() {
		return pExDate;
	}
	public void setpExDate(String pExDate) {
		this.pExDate = pExDate;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public ProductData(String pName, Date pMfgDate, Date pExDate, Double price) {
		super();
		
		String pattern = "yyyy-MM-dd";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
			
		this.pName = pName;
		this.pMfgDate = simpleDateFormat.format(pMfgDate);
		this.pExDate = simpleDateFormat.format(pExDate);
		this.price = price;
	}
	
	
	

}
