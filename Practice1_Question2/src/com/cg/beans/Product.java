package com.cg.beans;

public class Product {
	private int prodid;
	private String prodName;
	private float price;
	
	public Product(int prodid,String prodName,float price) {
		super();
		this.prodid=prodid;
		this.prodName=prodName;
		this.price=price;
	}

	public int getProdid() {
		return prodid;
	}

	public void setProdid(int prodid) {
		this.prodid = prodid;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}
	


}
