package sms.model;

import javax.persistence.*;

@Entity
public class Department {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int departmentId;
	private String departmentName;
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Department(String departmentName) {
		super();
		this.departmentName = departmentName;
	}
	
	
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	
	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + "]";
	}
	

}
