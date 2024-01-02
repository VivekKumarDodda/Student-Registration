package in.vivek.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import in.vivek.Entity.Course;
import in.vivek.Entity.Student;
import in.vivek.Service.StudentService;

@Controller
public class StudentController {
	
	@Autowired
	private StudentService sservice;
	
	@GetMapping("/register")
	public ModelAndView RegisterUser() {
		
		ModelAndView mav = new ModelAndView();
		List<Course> courses = sservice.findAllCourses();
		mav.addObject("student",new Student());
		mav.addObject("cors", courses);
		mav.setViewName("register");
		
		return mav;
	}
	@PostMapping("/save")
	public ModelAndView SaveUser(Student student) {
		
		ModelAndView mav = new ModelAndView();
		boolean saveStudent = sservice.saveStudent(student);
		if(saveStudent)
			mav.addObject("sucess","Saved Sucessefully");
		else
			mav.addObject("fail","Save failed");
		mav.setViewName("register");
		return mav; 
	}
}
