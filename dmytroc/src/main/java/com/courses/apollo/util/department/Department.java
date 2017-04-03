package com.courses.apollo.util.department;

import com.courses.apollo.model.department.Employee;

import java.util.ArrayList;
import java.util.List;

/**
 * Class Department.
 */
public class Department {
    /**
     * List of all positions in this department.
     */
    private List<Position> positions = new ArrayList<>();

    /**
     * Class position uses to add a new position to department.
     */
    public class Position {
        /**
         * Position name.
         */
        private String positionName;
        /**
         * List of all employees at this position.
         */
        private List<Employee> employees = new ArrayList<>();

        public Position(String positionName, Employee employee) {
            this.positionName = positionName;
            this.employees.add(employee);
            positions.add(this);
        }

        public Position(String position) {
            this.positionName = position;
            positions.add(this);
        }

        /**
         * Set new Employee to this position.
         *
         * @param employee employee.
         */
        public void setNewEmployee(Employee employee) {
            employees.add(employee);
        }

        public List<Employee> getEmployees() {
            return employees;
        }

        public Employee getCurrentEmployee() {
            return employees.get(employees.size() - 1);
        }

        public String getPositionName() {
            return positionName;
        }
    }

    public List<Position> getPositions() {
        return positions;
    }
}
