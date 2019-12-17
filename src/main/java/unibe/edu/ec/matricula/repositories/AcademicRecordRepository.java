package unibe.edu.ec.matricula.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import unibe.edu.ec.matricula.entities.AcademicRecord;
import unibe.edu.ec.matricula.entities.Student;
import unibe.edu.ec.matricula.entities.Subject;

public interface AcademicRecordRepository extends JpaRepository<AcademicRecord,Integer> {
    public AcademicRecord finTopByStudentAndSubject(Student student, Subject subject);
}
