package com.koda;

public class EmployeeService {
    private Employee employeeData;

    public EmployeeService(Employee employeeData) {
        this.employeeData = employeeData;
    }

    public void showEmployee() {
        employeeData.showEmployee();
    }

    public void giveRaise(int amount) {
        employeeData.increaseSalary(amount);
    }
}
