package com.company;

public class Simple {
    protected double number_1;
    protected double number_2;
    public Simple(double num1, double num2){
        this.number_1 = num1;
        this.number_2 = num2;
    }
    public void setNumber_1(double number_1) {
        this.number_1 = number_1;
    }
    public double getNumber_1() {
        return number_1;
    }
    public void setNumber_2(double number_2) {
        this.number_2 = number_2;
    }
    public double getNumber_2() {
        return number_2;
    }
    public double add(){
        return (number_1 + number_2);
    }
    public double sub(){
        return (number_1 - number_2);
    }
    public double mul(){
        return (number_1 * number_2);
    }
    public double div(){
        return (number_1 / number_2);
    }
}
