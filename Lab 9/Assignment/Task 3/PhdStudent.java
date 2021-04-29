package com.company;

public class PhdStudent extends Student{
    public PhdStudent(String Name, String ID){
        super(Name, ID);
    }
    @Override
    public void TakeExam() {
        super.TakeExam();
        System.out.print("You will have to give final defense presentation as your final exam\n");
    }
}
