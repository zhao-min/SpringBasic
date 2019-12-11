package sms.controller;

import java.util.ArrayList;

import javax.management.relation.Role;
import javax.security.sasl.AuthenticationException;
import javax.servlet.http.HttpSession;

import org.apache.tomcat.jni.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;



@Controller
public class MainFrontController {

	@GetMapping("/home")
	public ModelAndView home (AuthenticationException authentication, HttpSession session) {
		ModelAndView mv = new ModelAndView("/home");
		return mv;
	}
	
	@InitBinder
	protected void initBinder(WebDataBinder binder) {
		// binder.addValidators(new customValidator()); 
	} 

	
	@GetMapping("/Login")
	public String loginPage (@RequestParam(required = false) String error) {		
		User user = new User();
		ModelAndView mv = new ModelAndView();
		mv.addObject("user", user);
		
		if (error != null) {
			mv.addObject("hasError", true);
		}
		return "login";		
	}
	
	@RequestMapping("/Logout")
	public String logout(SessionStatus sessionStatus) {
		sessionStatus.setComplete();
		return "redirect:/login";
	}
		
	@GetMapping("/adminpage")
	public ModelAndView adminPage (HttpSession session, AuthenticationException authentication) {
		ModelAndView mv = new ModelAndView("/pendingApplication");
		//GrantedAuthority role = authentication.getAuthorities().stream().findFirst().get();
		//System.out.println(role);
		//ROLE_ADMIN
		return mv;
	}
	
	@GetMapping("/studentpage")
	public ModelAndView studentPage () {
		ModelAndView mv = new ModelAndView("/copyOfGrade");
		return mv;
	}
	
	@GetMapping("/facultypage")
	public ModelAndView facultyPage () {
		ModelAndView mv = new ModelAndView("/masterList");
		return mv;
	}

	
}
