package com.company;

public class L8AS2Runner {
    public static void main(String[] args) {
        System.out.println("Computer 1 Details:");
        Computer c1 = new Computer(32,6400,16000,52);
        c1.display();
        System.out.println("\nLaptop 1 Details:");
        Laptop l1 = new Laptop(32,6400,16000,52,10,15,20,100);
        l1.display();
        // Using set and get methods
        System.out.println("\nComputer 2 Details:");
        Computer c2 = new Computer();
        c2.setWord_size(64);
        c2.setMemory_size(32000);
        c2.setStorage_size(720000);
        c2.setSpeed(100);
        c2.display();

        System.out.println("\nLaptop 2 Details:");
        Laptop l2 = new Laptop();
        l2.setWord_size(64);
        l2.setMemory_size(32000);
        l2.setStorage_size(72000);
        l2.setSpeed(100);
        l2.setLength(20);
        l2.setWidth(25);
        l2.setHeight(30);
        l2.setWeight(125);
        l2.display();
    }
}
