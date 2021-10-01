package com.moglix.employeemanagementsystem.dto;

public class Role {
	
	private String roleID;
	private String rolName;
	
	
	public Role(String roleID, String rolName) {
		super();
		this.roleID = roleID;
		this.rolName = rolName;
	}
	public String getRoleID() {
		return roleID;
	}
	public void setRoleID(String roleID) {
		this.roleID = roleID;
	}
	public String getRolName() {
		return rolName;
	}
	public void setRolName(String rolName) {
		this.rolName = rolName;
	}
}
