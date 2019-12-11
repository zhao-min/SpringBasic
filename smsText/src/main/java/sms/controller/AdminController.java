package sms.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import sms.model.Course;
import sms.model.CourseRepository;
import sms.model.Department;
import sms.model.DepartmentRepository;
import sms.model.Faculty;
import sms.model.FacultyRepository;
import sms.model.Student;
import sms.model.StudentRepository;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	private CourseRepository crepo;
	@Autowired
	private StudentRepository srepo;
	@Autowired
	private FacultyRepository frepo;
	@Autowired
	private DepartmentRepository drepo;
	
	@GetMapping("/pending")
	public String pendingApplication(Model model) {
		
		return"pendingApplication";
	}
	
	@GetMapping("/studentUsers")
	public String StudentUsers(Model model) {
		ArrayList<Student>student=new ArrayList<Student>();
		student.addAll(srepo.findAll());
		model.addAttribute("student", student);
		return"studentUsers";
	}
	
	@GetMapping("/facultyUsers")
	public String FacultyUsers(Model model) {
		ArrayList<Faculty>faculty=new ArrayList<Faculty>();
		faculty.addAll(frepo.findAll());
		model.addAttribute("faculty", faculty);
		return"facultyUsers";
	}
	
	@GetMapping("/courses")
	public String findCourse(Model model) {
		ArrayList<Course>course=new ArrayList<Course>();
		course.addAll(crepo.findAll());
		model.addAttribute("course", course);
		return"courses";
	}
	
	@GetMapping("/departments")
	public String findDepartment(Model model) {
		ArrayList<Department>department=new ArrayList<Department>();
		department.addAll(drepo.findAll());
		model.addAttribute("department", department);
		return"departments";
	}

}
