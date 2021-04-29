package com.company;

public class L9AS2Runner {
    public static void main(String[] args) {
        CustomStringTokenizer cst1 = new CustomStringTokenizer("This is a test for Class 10");
        System.out.println("Number of tokens:" + cst1.countTokens());

        CustomStringTokenizer cst2 = new CustomStringTokenizer("You have joined the 1 class team for BSSE-2B");
        System.out.println("Number of tokens:" + cst2.countTokens());
    }
}