package com.Controller;

import java.util.jar.Attributes.Name;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.Dao.StudentDao;
import com.Model.Student;
import com.Model.User;

@Controller
public class MainController {
	
	@Autowired
	StudentDao sDao;
	
	@RequestMapping("/home")
	public String homePage() {
		
		return"home";
	}
	
	@RequestMapping("/register")
	public String register() {
		
		return"register";
	}
	
	@RequestMapping( value = "/add" ,method = RequestMethod.POST)
	public String AddDetails(@ModelAttribute Student student,Model model) {
		System.out.println(student);
		sDao.addStudent(student);
		model.addAttribute("msg", "welcome Mr./Ms. " + student.getNamString()+" your Registration Successful..!!" );
		return"home";
	}
	
	@RequestMapping( value = "/login")
	public String login() {
		
		
		return"login";
	}
	
	@RequestMapping("/loginVerify")
	public String loginVerify(@ModelAttribute User user,Model model) {
		System.out.println(user);
		String namString = user.getEmail();
		String passString = user.getPass();
		int flag = sDao.getUserInfo(namString,passString);
		Student student = sDao.getStudent();
		model.addAttribute("student",student);
		
		if ( flag == 0) {
			model.addAttribute("msg", "invalid login details");
			return"login";
			
		}else {
			return"StudentInfo";
			
		}
		
	}
	
	@RequestMapping("/UpdateStu")
	public String UpdateStu(Model model) {
		Student student = sDao.getStudent();
		model.addAttribute("student",student);
		return"update";
	}
	
	@RequestMapping("/updateHandler")
	public String updated(@ModelAttribute Student student,Model model) {
		System.out.println(student);
		sDao.addStudent(student);
		model.addAttribute("msg", "Updation Sccessful");
		return"StudentInfo";
	}
	
	@RequestMapping("/delete")
	public String removeStu(Model model) {
		
		model.addAttribute("ask", "sure");

		return"StudentInfo";
	}
	
	@RequestMapping("/finaldelete")
	public String delte(Model model) {
		sDao.removeStudent();
		model.addAttribute("done", "user deleted successfully....");
		return"login";
	}


}
