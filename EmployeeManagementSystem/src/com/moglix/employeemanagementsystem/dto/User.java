package com.moglix.employeemanagementsystem.dto;

public class User {

	private String userID;
	private String userName;
	private String password;
	private String emialID;
	private String roleID;
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmialID() {
		return emialID;
	}
	public void setEmialID(String emialID) {
		this.emialID = emialID;
	}
	public String getRoleID() {
		return roleID;
	}
	public void setRoleID(String roleID) {
		this.roleID = roleID;
	}
	public User(String userID, String userName, String password, String emialID, String roleID) {
		super();
		this.userID = userID;
		this.userName = userName;
		this.password = password;
		this.emialID = emialID;
		this.roleID = roleID;
	}
	
}
