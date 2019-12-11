package sms.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentGradeRepository extends JpaRepository <StudentGrade, Integer> {
	public StudentGrade findByStudent(Student student);
}
