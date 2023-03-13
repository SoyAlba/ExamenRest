package com.example.demo.repository;

import com.example.demo.model.Student;

public interface RepositoryStudent {

	void insert(Student student);
	Iterable<Student> listAll();
	void deleteAll();
	void delete1(Integer id);
	Student update(int id,String fct);
	Student getStudent(int id);
}
