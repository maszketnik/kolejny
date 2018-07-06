package com.example.springtest1.Controller;


import com.example.springtest1.Entity.Student;
import com.example.springtest1.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;
import java.awt.*;
import java.util.Collection;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired  //instatiate it for me
    private StudentService studentService;

    @RequestMapping(value="",method = RequestMethod.GET)
    public Collection<Student> getAllStudents(){
        return studentService.getAllStudents();
    }



    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Student getStudentById(@PathVariable("id") int id){
        return studentService.getStudentById(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteStudentById(@PathVariable("id") int id){
        studentService.removeStudentById(id);
    }
    @RequestMapping(value="/test")
    public String test(){
        return "test";
    }

    @RequestMapping(value = "", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateStudentById(@RequestBody Student student)
    {
        studentService.updateStudentById(student);
    }

    @RequestMapping(value = "", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void insertStudent(@RequestBody Student student)
    {
        studentService.insertStudent(student);
    }




}
