package com.koda;

public class Employee {
    private String employeeId;
    private String name;
    private String position;
    private String department;
    private int salary;

    public Employee(String employeeId, String name, String position, String department, int salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.position = position;
        this.department = department;
        this.salary = salary;
    }

    public void showEmployee() {
        System.out.println("Employee ID: " + getEmployeeId());
        System.out.println("Name: " + getEmployeeName());
        System.out.println("Position: " + getPosition());
        System.out.println("Department: " + getDepartment());
        System.out.println("Salary: Rp." + getSalary());
    }

    public void increaseSalary(int amount) {
        if (amount <= 0) {
            System.out.println("\n");
            System.out.println("Salary Increase: Rp. " + amount);
            System.out.println("Error: Kenaikan gaji harus lebih dari 0");
            System.out.println("Current Salary: Rp. " + getSalary());
        } else {
            System.out.println("\n");
            System.out.println("Salary Increase: Rp. " + amount);
            salary += amount;
            System.out.println("Current Salary: Rp. " + getSalary());
        }
        ;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return name;
    }

    public String getPosition() {
        return position;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

}
