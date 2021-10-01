package com.moglix.employeemanagementsystem.dto;

public class Catalog {

	private String productID;
	private String productName;
	private String catID;
	private String productDesignation;
	private String productImage;
	public String getProductID() {
		return productID;
	}
	public void setProductID(String productID) {
		this.productID = productID;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getCatID() {
		return catID;
	}
	public void setCatID(String catID) {
		this.catID = catID;
	}
	public String getProductDesignation() {
		return productDesignation;
	}
	public void setProductDesignation(String productDesignation) {
		this.productDesignation = productDesignation;
	}
	public String getProductImage() {
		return productImage;
	}
	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}
	public Catalog(String productID, String productName, String catID, String productDesignation, String productImage) {
		super();
		this.productID = productID;
		this.productName = productName;
		this.catID = catID;
		this.productDesignation = productDesignation;
		this.productImage = productImage;
	}
	
}
