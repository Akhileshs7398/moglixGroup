package com.moglix.employeemanagementsystem.dto;

public class Category {

	private String cartID;
	private String cartName;
	public Category(String cartID, String cartName) {
		super();
		this.cartID = cartID;
		this.cartName = cartName;
	}
	public String getCartID() {
		return cartID;
	}
	public void setCartID(String cartID) {
		this.cartID = cartID;
	}
	public String getCartName() {
		return cartName;
	}
	public void setCartName(String cartName) {
		this.cartName = cartName;
	}
}
