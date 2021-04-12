package com.company;

public class StudentRecord {
    private String degree;
    public StudentRecord() {
    }
    public StudentRecord(String s){
        degree = s;
    }
    public void setDegree (String deg) {
        degree = deg;
    }
    public String getDegree () {
        return degree;
    }
}

