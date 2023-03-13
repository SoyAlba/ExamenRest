package com.example.demo.Rest;

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
public class Rest{

    List<Student> list = new ArrayList<>();
    ListRepositoryStudent listRepositoryStudent = new ListRepositoryStudent();

    @PostMapping(path = "/ALUMNOS/LIST")
    public ResponseEntity<List<Student>> listAll() {
        return new ResponseEntity<>(listRepositoryStudent.listAll(), HttpStatus.OK);
    }

    @PostMapping(path = "/ALUMNOS/INSERT")
    public ResponseEntity<List<Student>> insert(@RequestBody Student student) {
        listRepositoryStudent.insert(student);
        return new ResponseEntity<>(listRepositoryStudent.listAll(), HttpStatus.OK);
    }

    @GetMapping(path = "/ALUMNOS/DELETE/{id}")
    public ResponseEntity<List<Student>> delete(@PathVariable Integer id) {
        listRepositoryStudent.delete1(id);
        return new ResponseEntity<>(listRepositoryStudent.listAll(), HttpStatus.OK);
    }

    @GetMapping(path = "/ALUMNOS/")

