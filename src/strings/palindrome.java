package strings;
import java.util.*;
public class palindrome {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        String st="";
        for(int i=0;i<str.length();i++)
        {
            char ch = str.charAt(i);
            st = ch+st;
        }

        if(str.equals(st))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}
