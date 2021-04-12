package com.company;

public class L7HA2Runner {
    public static void main(String[] args) {
        //First person's details
        Address a1 = new Address(14,12-4,"New York",21456);
        Person p1 = new Person("Paulo Coelho",a1,"941-555-444-6789");
        Book b1 = new Book(p1,"Alchemist", "Bruce Wayne");
        b1.display();

        //Second's persons details
        System.out.println("\n");
        Address a2 = new Address();
        a2.setStreet_number(97);
        a2.setHouse_number(27);
        a2.setCity("Houston Texas");
        a2.setCode(77005);
        Person p2 = new Person();
        p2.setName("Niall Horan");
        p2.setAddress(a2);
        p2.setContact_number("+941-112-245-6768");
        Book b2 = new Book();
        b2.setAuthor(p2);
        b2.setBook_name("Forty Rules Of Love");
        b2.setPublisher("Penguin Books");
        b2.display();
    }
}
