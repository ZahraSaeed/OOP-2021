package com.company;

public class Person {
    private String name;
    private Address address;
    private String contact_number;

    public Person(){
    }
    public Person(String n, Address a, String c_number){
        this.name = n;
        this.address = a;
        this.contact_number = c_number;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public Address getAddress() {
        return address;
    }
    public void setContact_number(String contact_number) {
        this.contact_number = contact_number;
    }
    public String getContact_number() {
        return contact_number;
    }
    public void display(){
        System.out.println("Name/Author: " + name + "\nContact number: " + contact_number);
        address.display();
    }
}
