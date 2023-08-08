package Beginner.Spring.Simple.Student.Management.System;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public void addStudent(Student student){
        studentRepository.addStudent(student);
    }
    public List<Student> allStudentsList(){
        return studentRepository.getAllStudents();
    }
    public Student getStudentDetails(int id){
        return studentRepository.getStudent(id);
    }
    public String updateStudent(int id,Student student){
        return studentRepository.updateStudent(id,student);
    }
    public void deleteStudent(int id){
        studentRepository.deleteStudent(id);
    }
}
