package com.courses.apollo.util;

import com.courses.apollo.util.department.Department;
import com.courses.apollo.model.department.Employee;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

/**
 * Department test.
 */
public class DepartmentTest {
    public Department department = new Department();

    @Before
    public void before() {
        Department.Position director = department.new Position("Director");
        director.setNewEmployee(new Employee("Ivan Invanenko", 2014, 12, 12));
        director.setNewEmployee(new Employee("Fedir Fedorenko", 2015, 01, 01));
        Department.Position leadEngineer =
                department.new Position("Lead Engineer",
                        new Employee("Sergyi Sergienko", 2014, 12, 12));
        Department.Position engineer = department.new Position("Engineer");
        engineer.setNewEmployee(new Employee("Vasyl Vasylenko", 2017, 01, 01));
    }

    @Test
    public void DepartmentTest() {
        List<Department.Position> positions = department.getPositions();
        for (Department.Position position : positions) {
            System.out.println(position.getPositionName());
            System.out.println(position.getCurrentEmployee().getEmployeeName());
        }
        for (Department.Position position : positions) {
            System.out.println("   " + position.getPositionName());
            for (Employee employee : position.getEmployees()) {
                System.out.print(employee.getEmployeeName());
                System.out.println("works from " + employee.getAccessionDate());
            }
        }
    }
}
