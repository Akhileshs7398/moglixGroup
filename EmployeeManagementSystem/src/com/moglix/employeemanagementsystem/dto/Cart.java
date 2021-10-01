package com.moglix.employeemanagementsystem.dto;

public class Cart {
	
	private String userID;
	private String invID;
	private String productID;
	private int productQty;
	private float totalprice;
	
	
	public Cart(String userID, String invID, String productID, int productQty, float totalprice) {
		super();
		this.userID = userID;
		this.invID = invID;
		this.productID = productID;
		this.productQty = productQty;
		this.totalprice = totalprice;
	}
	
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getInvID() {
		return invID;
	}
	public void setInvID(String invID) {
		this.invID = invID;
	}
	public String getProductID() {
		return productID;
	}
	public void setProductID(String productID) {
		this.productID = productID;
	}
	public int getProductQty() {
		return productQty;
	}
	public void setProductQty(int productQty) {
		this.productQty = productQty;
	}
	public float getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(float totalprice) {
		this.totalprice = totalprice;
	}
	
}
