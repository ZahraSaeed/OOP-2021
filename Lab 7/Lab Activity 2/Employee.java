package com.company;

public class Employee {
    private String name;
    private String fname;
    private Date birthdate;
    private Date hiredate;

    Employee() {
    }
    Employee (String x, String y, Date DateofBirth, Date dateofHire) {
        name = x;
        fname = y;
        birthdate = DateofBirth;
        hiredate = dateofHire;
    }
    public void setname(String x) {
        name = x;
    }
    public String getname() {
        return name;
    }
    public void setfname(String x) {
        fname = x;
    }
    public String getfname() {
        return fname;
    }
    public void setbirthdate(Date b) {
        birthdate = b;
    }
    public Date getbirthdate() {
        return birthdate;
    }
    public void sethiredate(Date h) {
        hiredate = h;
    }
    public Date gethiredate() {
        return hiredate;
    }
    public void display() {
        System.out.println("Name: " + name + " Father Name: " + fname);
        birthdate.display();
        hiredate.display();
    }
}
