package com.example.demo.service;

import com.example.demo.model.Student;

public interface ServiceStudent {

	void guardar(Student student);
	void borrarTodos();
	void delete1(Integer id);
	void listAll();

}
