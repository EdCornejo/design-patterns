/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.dev.core;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class EmployeeTest {
    
	@Test
    public void testEmployee() {
		String name = "dev";
		String position = "developer";
		
		Employee employee = new Employee(name, position);
        assertNotNull(name + " " + position, employee.printTimeSheetReport());
    }
}