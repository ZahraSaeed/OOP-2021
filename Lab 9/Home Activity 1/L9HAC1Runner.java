package com.company;

public class L9HAC1Runner {
    public static void main(String [] args) {
        Action a1 = new Action("PG-13", 311514,"AVENGERS ENDGAME");
        System.out.println(a1);
        System.out.println("Late Fees: $ " + a1.calcLateFees(1));
        Comedy c1 = new Comedy("PG-14", 429818, "JUMANJI");
        System.out.println(c1);
        System.out.println("Late Fees: $ " + c1.calcLateFees(2));
        Drama d1 = new Drama("R",168759, "FIVE FEET APART");
        System.out.println(d1);
        System.out.println("Late Fees: $ " + d1.calcLateFees(3));
        //checking if two movies have same IDs
        System.out.println("Are the ID numbers of the the action movie and comedy movie identical? " + a1.equals(c1));
        System.out.println("Are the ID numbers of the the action movie and drama movie identical? " + a1.equals(d1));
        System.out.println("Are the ID numbers of the the comedy movie and drama movie identical? " + c1.equals(d1));
    }
}
