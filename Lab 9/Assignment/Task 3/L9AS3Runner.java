package com.company;

public class L9AS3Runner {
    public static void main(String[] args) {
        PhdStudent student1 = new PhdStudent("ZAHRA","SP20-BSE-100");
        student1.TakeExam();

        GradStudent student2 = new GradStudent("NIMRA","SP20-BSE-077");
        student2.TakeExam();
        
        PhdStudent student3 = new PhdStudent("Noor","SP20-BSE-078");
        student3.TakeExam();
    }
}
