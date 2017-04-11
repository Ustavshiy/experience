package com.courses.apollo.util.department;

import com.courses.apollo.util.department.Department;
import com.courses.apollo.model.department.Employee;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Department test.
 */
public class DepartmentTest {
    public Department department = new Department();
    Department.Position director = department.new Position("Director");
    Department.Position engineer = department.new Position("Engineer");
    Department.Position leadEngineer =
            department.new Position("Lead Engineer",
                    new Employee("Sergyi Sergienko", 2014, 12, 12));
    List<Department.Position> expectedResult = new ArrayList<>();

    @Before
    public void before() {
        director.setNewEmployee(new Employee("Ivan Invanenko", 2014, 12, 12));
        director.setNewEmployee(new Employee("Fedir Fedorenko", 2015, 01, 01));
        engineer.setNewEmployee(new Employee("Vasyl Vasylenko", 2017, 01, 01));
        expectedResult.add(director);
        expectedResult.add(engineer);
        expectedResult.add(leadEngineer);

    }

    @Test
    public void DepartmentTest() {
        List<Department.Position> testPositions = department.getPositions();
        Assert.assertEquals(expectedResult, testPositions);
    }

    @Test
    public void PositionTest() {
        String expectedAccessionDate = "2017-01-01";
        String expectedCurrentEmployeeName = "Fedir Fedorenko";
        Assert.assertEquals(expectedAccessionDate, engineer.getCurrentEmployee().getAccessionDate());
        Assert.assertEquals(expectedCurrentEmployeeName, director.getCurrentEmployee().getEmployeeName());
    }
}

