package strings;

import java.util.*;
public class Program2 {
    String concat(String s1,String s2)
    {
        s1=s1.toLowerCase();s2=s2.toLowerCase();
        if(s1.charAt(s1.length()-1)==s2.charAt(0))
            s1=s1+s2.substring(1);
        else s1=s1+s2;
        return s1;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String s2= sc.nextLine();
        Program2 ob = new Program2();
        System.out.println(ob.concat(s,s2));
    }

}
