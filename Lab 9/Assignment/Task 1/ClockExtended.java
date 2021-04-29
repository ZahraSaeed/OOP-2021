package com.company;

public class ClockExtended extends Clock{
    public ClockExtended(String hours, String min, String sec) {
        super(hours, min, sec);
    }
    @Override
    public void Display(){
        //displaying 24 hour format
        System.out.println("24 Hour Format:");
        super.Display();
        System.out.println("12 Hour Format:");
        //converting 24 hour format to 12 hour format.
        System.out.println("hr:min:sec");
        int hour_1 = (int)hr.charAt(0) - '0';
        int hour_2 = (int)hr.charAt(1)- '0';
        int tot_hour = hour_1 * 10 + hour_2;
        String a;
        if(tot_hour < 12)
            a="AM";
        else
            a="PM";
        tot_hour %= 12;
        if (tot_hour == 0) {
            System.out.print("12");
            System.out.print(":"+min+":"+sec);
        }
        else{
            System.out.print(tot_hour);
            System.out.print(":"+min+":"+sec);
        }
        System.out.println(" "+a);
    }
}