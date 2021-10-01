package com.moglix.employeemanagementsystem.dto;

public class Orders {
	private String orderID;
	private String userID;
	private String invID;
	private String productID;
	private int productQty;
	private float totalPrice;
	private float grandTotalPrice;
	
	
	public Orders(String orderID, String userID, String invID, String productID, int productQty, float totalPrice,
			float grandTotalPrice) {
		super();
		this.orderID = orderID;
		this.userID = userID;
		this.invID = invID;
		this.productID = productID;
		this.productQty = productQty;
		this.totalPrice = totalPrice;
		this.grandTotalPrice = grandTotalPrice;
	}
	public String getOrderID() {
		return orderID;
	}
	public void setOrderID(String orderID) {
		this.orderID = orderID;
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
	public float getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}
	public float getGrandTotalPrice() {
		return grandTotalPrice;
	}
	public void setGrandTotalPrice(float grandTotalPrice) {
		this.grandTotalPrice = grandTotalPrice;
	}

}
