package com.company;

public class L6HA2Runner {
    public static void main(String[] args) {
        Object_Count object1 = new Object_Count();
        Object_Count object2 = new Object_Count();
        Object_Count object3 = new Object_Count();
        Object_Count object4 = new Object_Count();
        Object_Count object5 = new Object_Count();
        Object_Count object6 = new Object_Count();
        System.out.println("Total number of objects created = " + Object_Count.Number_of_objects_created());
        object2.Number_of_objects_destroyed();
        object5.Number_of_objects_destroyed();
        object6.Number_of_objects_destroyed();
        System.out.println("Number of objects destroyed = " + Object_Count.Number_of_objects_destroyed());
    }
}
