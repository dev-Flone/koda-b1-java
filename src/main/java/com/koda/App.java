package com.koda;

public class App {
    public static void main(String[] args) {
        Employee employee = new Employee("EMP001", "Andi Pratama", "Backend Developer", "IT", 5000000);

        EmployeeService employeeService = new EmployeeService(employee);

        employeeService.showEmployee();
        employeeService.giveRaise(1000000);
        employeeService.giveRaise(-500000);
    }
}
