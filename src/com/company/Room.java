package com.company;
import java.util.*;
public class Room {
    static boolean AC_ON,HOME_THEATRE_ON,FAN_ON,LIGHT_ON;
    public Room()
    {
        AC_ON =false;
        HOME_THEATRE_ON=false;
        FAN_ON=false;
        LIGHT_ON = false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("MENU");
        System.out.println("Enter true if Ac is on");
        AC_ON = sc.nextBoolean();
        System.out.println("Enter true if Home Theatre is on");
        HOME_THEATRE_ON = sc.nextBoolean();
        System.out.println("Enter true if Fan is on");
        FAN_ON = sc.nextBoolean();
        System.out.println("Enter true if Light is on");
        LIGHT_ON = sc.nextBoolean();
        int total_load=0;
        if(AC_ON)
            total_load += 1200;
        if(HOME_THEATRE_ON)
            total_load +=600;
        if(FAN_ON)
            total_load += 400;
        if(LIGHT_ON)
            total_load += 100;

        if(total_load>2000)
            System.out.println("OVERLOAD");
        else
            System.out.println("NORMAL LOAD");


    }

}
