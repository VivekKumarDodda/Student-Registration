package in.vivek.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.vivek.Entity.Course;

public interface CourseRepo extends JpaRepository<Course, String> {

}
