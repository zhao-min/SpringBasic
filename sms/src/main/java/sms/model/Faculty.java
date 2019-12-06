package sms.model;

import javax.persistence.*;

@Entity
public class Faculty {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int facultyId;
	private String facultyName;
	@ManyToOne
	@JoinColumn(name="departmentId")
	private Department department;
	
	
	public Faculty() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Faculty(String facultyName, Department department) {
		super();
		this.facultyName = facultyName;
		this.department = department;
	}
	

	public int getFacultyId() {
		return facultyId;
	}
	public void setFacultyId(int facultyId) {
		this.facultyId = facultyId;
	}
	public String getFacultyName() {
		return facultyName;
	}
	public void setFacultyName(String facultyName) {
		this.facultyName = facultyName;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	
	
	@Override
	public String toString() {
		return "Faculty [facultyId=" + facultyId + ", facultyName=" + facultyName + ", department=" + department + "]";
	}
	


}
