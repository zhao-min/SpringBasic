package sms.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EnrollmentDetails {

	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int enrollmentId;
	private int studentId;
	private int courseCode;
	private int semester;
	private String status;
	
	public EnrollmentDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public EnrollmentDetails(int courseCode, int semester, String status) {
		super();
		this.courseCode = courseCode;
		this.semester = semester;
		this.status = status;
	}


	public int getEnrollmentId() {
		return enrollmentId;
	}


	public void setEnrollmentId(int enrollmentId) {
		this.enrollmentId = enrollmentId;
	}


	public int getStudentId() {
		return studentId;
	}


	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}


	public int getCourseCode() {
		return courseCode;
	}


	public void setCourseCode(int courseCode) {
		this.courseCode = courseCode;
	}


	public int getSemester() {
		return semester;
	}


	public void setSemester(int semester) {
		this.semester = semester;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}



	@Override
	public String toString() {
		return "EnrollmentDetails [enrollmentId=" + enrollmentId + ", studentId=" + studentId + ", courseCode="
				+ courseCode + ", semester=" + semester + ", status=" + status + "]";
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + enrollmentId;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EnrollmentDetails other = (EnrollmentDetails) obj;
		if (enrollmentId != other.enrollmentId)
			return false;
		return true;
	}

	
	
}
