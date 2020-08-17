package com.dev.core;

public class Employee {
	private final String name;
	private final String position;
	
	public Employee(String name, String position) {
		super();
		this.name = name;
		this.position = position;
	}
	
	public String getName() {
		return name;
	}
	public String getPosition() {
		return position;
	}
	
	public String printTimeSheetReport() {
		return name + " " + position;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", position=" + position + "]";
	}
	
}
