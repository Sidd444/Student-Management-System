package Beginner.Spring.Simple.Student.Management.System;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class StudentRepository {
    private List<Student> s;
    private HashMap<Integer,Student> hm;

    public StudentRepository() {
        this.s=new ArrayList<>();
        this.hm=new HashMap<>();
    }
    public void addStudent(Student student){
        hm.put(student.getId(),student);
    }
    public List<Student> getAllStudents(){
        for(int i:hm.keySet()) s.add(hm.get(i));
        return s;
    }
    public Student getStudent(int id){
        return hm.get(id);
    }
   public String updateStudent(int id,Student student){
        if(!hm.containsKey(id)) return "Student Does not exists";
        Student updateStudent=hm.get(id);
        updateStudent.setName(student.getName());
        updateStudent.setAge(student.getAge());
        updateStudent.setCourse(student.getCourse());
        return "Student record updated successfully";
   }
    public void deleteStudent(int id){
        hm.remove(id);
    }
}
