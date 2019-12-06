package sms.model;

import javax.persistence.*;

@Entity
public class Role {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int roleId;
	private String roleDescription;
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Role(String roleDescription) {
		super();
		this.roleDescription = roleDescription;
	}
	
	
	
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public String getRoleDescription() {
		return roleDescription;
	}
	public void setRoleDescription(String roleDescription) {
		this.roleDescription = roleDescription;
	}
	
	
	@Override
	public String toString() {
		return "Role [roleId=" + roleId + ", roleDescription=" + roleDescription + "]";
	}

}
