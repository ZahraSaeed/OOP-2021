package com.company;

public class L7HA1Runner {
    public static void main(String[] args) {
        // First person's address details
        Address a1 = new Address(14,1064,"Rawalpindi",24506);
        Person p1 = new Person("Zahra", a1, "0333-5244850");
        p1.display();

        //Second person's address details
        Address a2 = new Address();
        a1.setStreet_number(10);
        a1.setHouse_number(1144);
        a1.setCity("Islamabad");
        a1.setCode(20146);
        Person p2 = new Person("Salaar", a1, "0333-1122334");
        p2.display();
    }
}