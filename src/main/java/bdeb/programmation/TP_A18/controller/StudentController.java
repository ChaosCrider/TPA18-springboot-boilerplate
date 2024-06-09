package bdeb.programmation.TP_A18.controller;

import bdeb.programmation.TP_A18.dao.StudentRepository;
import bdeb.programmation.TP_A18.models.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Students")
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;

    @GetMapping
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }

    @GetMapping("/userId")
    public ResponseEntity<Student> getUserById(@PathVariable Long userId) {
        Optional<Student> userOptional = studentRepository.findById(userId);
        if (userOptional.isPresent()) {
            return ResponseEntity.ok(userOptional.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student){
        return studentRepository.save(student);
    }



    @GetMapping("/Reset")
    public List<Student> resetDB(){
        //full data
        studentRepository.deleteAll();

        //the premade students to add
        Student[] students = {
                new Student("Alice", "Smith", Student.specialites.ProgrammeurAnalyst),
                new Student("Bob", "Johnson", Student.specialites.AssuranceQualite),
                new Student("Emily", "Brown", Student.specialites.TechicienInformatique),
                new Student("Jack", "Davis", Student.specialites.GestionDeProjet),
                new Student("Sophia", "Wilson", Student.specialites.ProgrammeurAnalyst)
        };

        //add all students one by one.
        for (Student s : students ) {
            Student student = new Student();
            student.setNom(s.getNom());
            student.setPrenom(s.getPrenom());
            student.setSpecialite(s.getSpecialite()); // Assigning different specialties
            studentRepository.save(student);
        }
        return studentRepository.findAll();
    }

}
