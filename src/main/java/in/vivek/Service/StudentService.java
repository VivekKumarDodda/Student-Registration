package in.vivek.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.vivek.Entity.Course;
import in.vivek.Entity.Student;
import in.vivek.Repo.CourseRepo;
import in.vivek.Repo.StudentInterface;

@Service
public class StudentService {
	@Autowired
	private StudentInterface sinterface;
	@Autowired
	private CourseRepo crepo;
	
	public List<Course> findAllCourses(){
		return crepo.findAll();
	}
	
	public boolean saveStudent(Student student) {
		 sinterface.save(student);
		
		return true;
	}
}
