package com.java.assignment;

public class Product {
	private int prodId;
	private String prodName;
	private double prodPrice;
	private int prodQty;
	private String Vendor;
	private String category;
	public int getProdId() {
		return prodId;
	}
	public void setProdId(int prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public double getProdPrice() {
		return prodPrice;
	}
	public void setProdPrice(double prodPrice) {
		this.prodPrice = prodPrice;
	}
	public int getProdQty() {
		return prodQty;
	}
	public void setProdQty(int prodQty) {
		this.prodQty = prodQty;
	}
	public String getVendor() {
		return Vendor;
	}
	public void setVendor(String vendor) {
		Vendor = vendor;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Product(int prodId, String prodName, double prodPrice, int prodQty, String vendor, String category) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodPrice = prodPrice;
		this.prodQty = prodQty;
		Vendor = vendor;
		this.category = category;
	}
	@Override
	public String toString() {
		return "\n Product [prodId=" + prodId + ", prodName=" + prodName + ", prodPrice=" + prodPrice + ", prodQty="
				+ prodQty + ", Vendor=" + Vendor + ", category=" + category + "]";
	}
	
	

	
	
}
