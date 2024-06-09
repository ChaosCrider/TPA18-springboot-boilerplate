package bdeb.programmation.TP_A18.dao;

import bdeb.programmation.TP_A18.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
