package com.example.springtest1.Dao;

import com.example.springtest1.Entity.Student;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;

import static javax.swing.UIManager.put;

@Repository
public class StudentDao {

    private static HashMap<Integer, Student> students;

    static{
        students = new HashMap<Integer, Student>(){
            {
                put(1,new Student(1,"Tomek","IT"));
                put(2,new Student(2,"Michał","English"));
                put(3,new Student(3,"Ola","IT"));
                put(4,new Student(4,"Krzysiek","Music"));
            }
        };
    }

    public Collection<Student> getAllStudents(){
        return this.students.values();
    }

    public Student getStudentById(int id) {
        return students.get(id);
    }

    public void removeStudentbyId(int id) {
        students.remove(id);
    }

    public void updateStudentById(Student student)
    {
        Student tempStudent = students.get(student.getId());

        tempStudent.setName(student.getName());
        tempStudent.setCourse(student.getCourse());

        students.put(student.getId(),tempStudent);
    }




    public void insertStudent(Student student) {
        students.put(student.getId(), student);

    }
}
