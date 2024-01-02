package in.vivek.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import in.vivek.Entity.Student;

public interface StudentInterface extends JpaRepository<Student, String>{

}
