package com.example.springtest1.Service;

import com.example.springtest1.Dao.StudentDao;
import com.example.springtest1.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;

    public Collection<Student> getAllStudents(){
        return studentDao.getAllStudents();
    }

    public void removeStudentById(int id){
        studentDao.removeStudentbyId(id);
    }

    public Student getStudentById(int id) {
        return studentDao.getStudentById(id);

    }

    public void updateStudentById(Student student)
    {
        studentDao.updateStudentById(student);
    }

    public void insertStudent(Student student) {
        studentDao.insertStudent(student);
    }
}
