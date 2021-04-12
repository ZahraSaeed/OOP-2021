package com.company;

public class Address {
    private int street_number;
    private int house_number;
    private String city;
    private int code;
    public Address(){
    }
    public Address(int s, int h, String c, int a){
        street_number = s;
        house_number = h;
        city = c;
        code = a;
    }
    public void setStreet_number(int street_number) {
        this.street_number = street_number;
    }
    public int getStreet_number() {
        return street_number;
    }
    public void setHouse_number(int house_number) {
        this.house_number = house_number;
    }
    public int getHouse_number() {
        return house_number;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getCity() {
        return city;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public int getCode() {
        return code;
    }
    public void display(){
        System.out.println("ADDRESS \nStreet number " + street_number + ",house number "
                + house_number + ",city " + city + ",postel code is " + code);
    }
}
