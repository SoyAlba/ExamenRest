package com.example.demo.model;

public class Student {

	private int id;
	private String name;
	private boolean FCT;

	public Student(int id, String name, boolean FCT) {
		super();
		this.id = id;
		this.name = name;
		this.FCT = FCT;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isFCT() {
		return FCT;
	}
	public void setFCT(Boolean fCT) {
		FCT = fCT;
	}

}
