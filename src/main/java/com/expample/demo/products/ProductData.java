package com.expample.demo.products;

import java.util.Date;

public class ProductData {
	
	String pName;
	Date pMfgDate;
	Date pExDate;
	Double price;
	public String getpName() {
		return pName;
	}
	public void setpName(String pName) {
		this.pName = pName;
	}
	public Date getpMfgDate() {
		return pMfgDate;
	}
	public void setpMfgDate(Date pMfgDate) {
		this.pMfgDate = pMfgDate;
	}
	public Date getpExDate() {
		return pExDate;
	}
	public void setpExDate(Date pExDate) {
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
		this.pName = pName;
		this.pMfgDate = pMfgDate;
		this.pExDate = pExDate;
		this.price = price;
	}
	
	
	

}
