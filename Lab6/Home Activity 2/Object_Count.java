package com.company;

public class Object_Count {
    private static int number_of_objects;
    public Object_Count(){
        number_of_objects++;
    }
    public static int Number_of_objects_created(){
        return number_of_objects;
    }
    public static int Number_of_objects_destroyed(){
        return number_of_objects--;
    }
}
