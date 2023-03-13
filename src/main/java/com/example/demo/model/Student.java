package com.example.demo.model;

public class Student {

	private int id;
	private String name;
	private String FCT;

	public Student(int id, String name, String FCT) {
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
	public String getFCT() {
		return FCT;
	}
	public void setFCT(String fCT) {
		FCT = fCT;
	}

}
