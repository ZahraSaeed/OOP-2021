package com.company;

public class Manager {
    private String title ;
    private double dues;
    private EmployeeRecord emp;
    private StudentRecord stu;

    public Manager(String t, double d, EmployeeRecord e, StudentRecord s) {
        title = t;
        dues = d;
        emp = e;
        stu = s;
    }
    public void display(){
        System.out.println("Title is: "+title);
        System.out.println("Dues are: "+dues);

        System.out.println("Employee record is under: ");
        System.out.println("Employee Id is: "+emp.getEmp_id());
        System.out.println("Employee salary is: "+emp.getSalary());

        System.out.println("Student record is as under: ");
        System.out.println("Degree is : "+ stu.getDegree());
    }
}
