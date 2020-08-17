package com.dev.core;

public class TimeSheetReport {

	public String print(Employee employee) {
		return employee.getName() + " " + employee.getPosition();
	}
	
}
