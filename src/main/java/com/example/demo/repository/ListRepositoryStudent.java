package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Student;

@Repository("list")
public class ListRepositoryStudent implements RepositoryStudent {

	static List<Student> ListaAlunos = new ArrayList<Student>();
	
	void init(){
		ListaAlunos.add(new Student(1, "Juan", "no"));
		ListaAlunos.add(new Student(2, "Pedro", "si"));
		ListaAlunos.add(new Student(3, "Maria", "no"));
		ListaAlunos.add(new Student(4, "Jose", "si"));
		ListaAlunos.add(new Student(5, "Luis", "no"));
	}

	@Override
	public void insert(Student student) {
		ListaAlunos.add(student);

		for (Student s : ListaAlunos) {
			System.out.println(s);
		}

		ListaAlunos.forEach(System.out::println);

		ListaAlunos.forEach((s) -> System.out.println(s));
	}
	@Override
	public List<Student> listAll() {
		init();
		return ListaAlunos;
	}

	@Override
	public void deleteAll() {
		ListaAlunos.clear();
	}

	@Override
	public void delete1(Integer id) {
		ListaAlunos.remove(id.intValue() - 1);
	}

	@Override
	public Student update(int id,String fct) {
		ListaAlunos.get(id).setFCT(fct);
		return ListaAlunos.get(id);
	}

	@Override
	public Student getStudent(int id) {
		return ListaAlunos.get(id);
	}

}
