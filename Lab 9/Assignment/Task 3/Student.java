package com.company;

abstract public class Student {
    protected String name;
    protected String Id;
    public Student(String Name, String ID) {
        this.name = Name;
        this.Id = ID;
    }
    public void TakeExam(){
        System.out.println("Name: " + name + "\nID: " + Id);
    }
}
