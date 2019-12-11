package sms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import sms.model.CourseRepository;
import sms.model.StudentGradeRepository;
import sms.model.StudentRepository;

@Controller
@RequestMapping("/faculty")
public class FacultyController {

	@Autowired
	private CourseRepository crepo;
	@Autowired
	private StudentRepository srepo;
	@Autowired
	private StudentGradeRepository sgrepo;
	
	@GetMapping("/master")
	public String MasterList(Model model) {
		
		return"masterList";
	}
	
	@GetMapping("/courselist")
	public String CourseList(Model model) {
		
		return"courseList";
	}
	
	@GetMapping("/studentList")
	public String StudentList(Model model) {
		
		return"studentList";
	}
	
	@GetMapping("/scoreCards")
	public String ScoreCards(Model model) {
		
		return"scoreCards";
	}
}
