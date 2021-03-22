package com.company;

import static com.company.ObjectPass.increment;

public class L5AC1Runner {
    public static void main(String[] args) {
        ObjectPass p = new ObjectPass();
        p.value = 5;
        System.out.println("Before calling: " + p.value);
        increment(p);
        System.out.println("After calling: " + p.value);
    }
}