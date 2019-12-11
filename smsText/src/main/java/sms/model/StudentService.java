package sms.model;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepo;
	@Autowired
	private StudentGradeRepository sgrepo;
	
	public List<Student> listStudent(){
		return (List<Student>)studentRepo.findAll();
	}
	
	public Student getStudentbyId(int id) {
		return studentRepo.findById(id).get();
	}

	public StudentGrade getStudentName(Student student) {
		return sgrepo.findByStudent(student);
	}
	
//	@Autowired
//	private StudentGradeRepository gradeRepo;
	
	@Autowired CourseRepository courseRepo;
	public ArrayList<Course> listcourse(){
		return (ArrayList<Course>) courseRepo.findAll();
	}

	

}
