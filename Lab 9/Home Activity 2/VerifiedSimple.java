package com.company;

public class VerifiedSimple extends Simple{
    public VerifiedSimple(double number_1, double number_2){
        super(number_1, number_2);
    }
    @Override
    public double add() {
        if (number_1 > 0 && number_2 >0) {
            return super.add();
        }
        else{
            return 000;
        }
    }
    @Override
    public double sub() {
        if (number_1 > 0 &&number_2 >0) {
            return super.sub();
        }
        else {
            return 000;
        }
    }
    @Override
    public double mul() {
        if (number_1 > 0 &&number_2 >0) {
            return super.mul();
        }
        else{
            return 000;
        }
    }
    @Override
    public double div() {
        if (number_1 > 0 &&number_2 >0) {
            return super.div();
        }
        else {
            return 000;
        }
    }
}
