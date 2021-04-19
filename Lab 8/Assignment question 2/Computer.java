package com.company;

public class Computer {
    protected double word_size;
    protected double memory_size;
    protected double storage_size;
    protected double speed;
    public Computer(){
        word_size = 0;
        memory_size = 0;
        storage_size = 0;
        speed = 0;
    }
    public Computer(double wordSize, double memorySize, double storageSize, double Speed){
        this.word_size = wordSize;
        this.memory_size = memorySize;
        this.storage_size = storageSize;
        this.speed = Speed;
    }

    public void setWord_size(double word_size) {
        this.word_size = word_size;
    }
    public void setMemory_size(double memory_size) {
        this.memory_size = memory_size;
    }
    public void setStorage_size(double storage_size) {
        this.storage_size = storage_size;
    }
    public void setSpeed(double speed) {
        this.speed = speed;
    }
    public double getWord_size() {
        return word_size;
    }
    public double getMemory_size() {
        return memory_size;
    }
    public double getStorage_size() {
        return storage_size;
    }
    public double getSpeed() {
        return speed;
    }
    public void display(){
        System.out.println("Word size = "+word_size+" bits.\nMemory size= "+memory_size+" megabytes.\n" +
                "Storage size = "+storage_size+" megabytes.\nSpeed = "+speed+" megahertz");
    }
}