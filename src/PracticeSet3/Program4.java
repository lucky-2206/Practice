package PracticeSet3;

import java.util.Scanner;

public class Program4 {
    String name;
    double percentage;
    Program4(String name,double percentage)
    {
        this.name=name;
        this.percentage=percentage;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name and percentage of student 1");
        Program4 stu1=new Program4(sc.next(),sc.nextDouble());
        System.out.println("Enter name and percentage of student 2");
        Program4 stu2=new Program4(sc.next(),sc.nextDouble());
        System.out.println("Enter name and percentage of student 3");
        Program4 stu3=new Program4(sc.next(),sc.nextDouble());
        if(stu1.percentage>stu2.percentage&&stu1.percentage>stu3.percentage)
            System.out.println("Topper is "+stu1.name+" Percentage is "+stu1.percentage);
        else if(stu2.percentage>stu1.percentage&&stu2.percentage>stu3.percentage)
             System.out.println("Topper is "+stu2.name+" Percentage is "+stu2.percentage);
        else
            System.out.println("Topper is "+stu3.name+" Percentage is "+stu3.percentage);
        }
    }
