package PracticeSet3;

import java.util.Scanner;

public class ClassRoom {
    Boolean AC_ON,HOME_THEATRE_ON,FAN_ON,LIGHT_ON;
    static int AC = 1200,HOME = 600,FAN = 400,LIGHT = 100;
    public ClassRoom(){
        AC_ON = false;
        HOME_THEATRE_ON = false;
        FAN_ON = false;
        LIGHT_ON = false;
    }
    public String state(Boolean b){
        if(b) return "ON";
        else return "OFF";
    }
    public static void change(ClassRoom obj,int i){
        if(i==1) obj.AC_ON = true;
        else if(i==2) obj.HOME_THEATRE_ON = true;
        else if(i==3) obj.FAN_ON = true;
        else if(i==4) obj.LIGHT_ON = true;
        else if(i==5) billCalculate(obj);
    }
    public static void billCalculate(ClassRoom obj){
        int bill = 0;
        if(obj.AC_ON) bill += AC;
        if(obj.HOME_THEATRE_ON) bill += HOME;
        if(obj.FAN_ON) bill += FAN;
        if(obj.LIGHT_ON) bill += LIGHT;
        if(bill > 2000) System.out.println("OVERLOAD");
        else System.out.println("Bill Amount : "+bill);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ClassRoom obj = new ClassRoom();
        int t;
        do{
            System.out.println("Menu");
            System.out.println("-------------------------------------");
            System.out.println("Press 1 for turning AC On : "+obj.state(obj.AC_ON));
            System.out.println("Press 2 for turning HOME THEATRE On: "+obj.state(obj.HOME_THEATRE_ON));
            System.out.println("Press 3 for turning FAN On: "+obj.state(obj.FAN_ON));
            System.out.println("Press 4 for turning LIGHT On: "+obj.state(obj.LIGHT_ON));
            System.out.println("Press 5 for turning For Calculating Bill ");
            System.out.println("-------------------------------------");
            System.out.print("Enter Choice -> ");
            t = sc.nextInt();
            ClassRoom.change(obj,t);
        }while (t != 5);
    }
}
