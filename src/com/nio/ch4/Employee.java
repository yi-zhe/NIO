package com.nio.ch4;

import java.io.Serializable;

public class Employee implements Serializable {

	private static final long serialVersionUID = 5052102879753105640L;

	private String name;
	private int age;

	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

}
