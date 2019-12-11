package sms.controller;


import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import sms.model.Course;
import sms.model.CourseRepository;
import sms.model.EnrollmentDetails;
import sms.model.Student;
import sms.model.StudentGrade;
import sms.model.StudentGradeRepository;
import sms.model.StudentService;


@Controller
@RequestMapping("/students")
public class StudentController {

	@Autowired
	private CourseRepository crepo;
	@Autowired
	private StudentService studentService ;
	

	
	@GetMapping("/grades")
	public String grades(Model model) {
	Student student	=studentService.getStudentbyId(1);
	StudentGrade sg = studentService.getStudentName(student);
		model.addAttribute("studentgrade", sg);
		return "copyOfGrades";
	}
	
	@GetMapping("/availableCourse")
	public String showAvailableCourse(Model model) {
		ArrayList<Course>course=new ArrayList<Course>();
		course.addAll(crepo.findAll());
		model.addAttribute("course", course);
		return"availableCourse";
	}
	
	
	@GetMapping("/enrolledCourse")
	public String EnrollCourse(Model model) {
		EnrollmentDetails enroll=new EnrollmentDetails();
		model.addAttribute("EnrollCourse", enroll);
		return"enrollCourse";
	}
	
	@GetMapping("/cancel/{courseCode}")
	public String CancelCourse(Model model, @PathVariable("courseCode") Integer courseCode) {
		Course course = crepo.findById(courseCode).get();
		crepo.delete(course);
		return "copyOfGrades";
	}
	
}
