package in.vivek.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity	
public class Student {
	
	@Id
	private String name;
	private String email;
	private String gender;
	private String Course;
	private String Timings;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCourse() {
		return Course;
	}
	public void setCourse(String course) {
		Course = course;
	}
	public String getTimings() {
		return Timings;
	}
	public void setTimings(String timings) {
		Timings = timings;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", email=" + email + ", gender=" + gender + ", Course=" + Course + ", Timings="
				+ Timings + "]";
	}
	
	

}
