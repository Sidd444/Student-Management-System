package Beginner.Spring.Simple.Student.Management.System;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {
     @Autowired
     StudentService studentService;
     @PostMapping("/add")
     public String addStudent(@RequestBody Student student){
         studentService.addStudent(student);
         return "New Student Added Successfully";
     }
     @GetMapping("view/all-students")
    public List<Student> viewStudents(){
         return studentService.allStudentsList();
     }
     @GetMapping("view/student-details-by-id")
    public Student getStudentByid(@RequestParam int id){
         return studentService.getStudentDetails(id);
     }
     @PutMapping("/update-details")
    public String updateStudent(@RequestParam int id,@RequestBody Student student){
         return studentService.updateStudent(id,student);
     }
     @DeleteMapping("/delete-student")
    public String deleteStudent(@RequestParam int id){
         studentService.deleteStudent(id);
         return "Student Deleted Successfully";
     }
}
