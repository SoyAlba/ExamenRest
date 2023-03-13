package com.example.demo.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.ListRepositoryStudent;
import com.example.demo.model.Student;

@RestController
@RequestMapping(path = "/api")
public class StudentRestController{

    List<Student> list = new ArrayList<>();
    ListRepositoryStudent listRepositoryStudent = new ListRepositoryStudent();

    @PostMapping(path = "/ALUMNOS/LIST")
    public List<Student> listAll() {
        return listRepositoryStudent.listAll();
	}

    @PostMapping(path = "/ALUMNOS/INSERT")
    public Student insert(@RequestBody Student student) {
		student = new Student(1,"pikachu","si");
        listRepositoryStudent.insert(student);
		return student;
    }

    @GetMapping(path = "/ALUMNOS/DELETE/{id}")
    public Student delete(@PathVariable Integer id) {
		Student student = listRepositoryStudent.getStudent(id);
        listRepositoryStudent.delete1(id);
		return student;
    }

    @GetMapping(path = "/ALUMNOS/UPDATE/{id}/")
    public Student update(@PathVariable Integer id, @RequestParam String fct) {
        Student student = listRepositoryStudent.getStudent(id);
        listRepositoryStudent.update(id, fct);
        return student;
    }

    @GetMapping(path = "/ALUMNOS/DELETEALL")
    public List<Student> deleteAll() {
        listRepositoryStudent.deleteAll();
        return listRepositoryStudent.listAll();
    }

}



