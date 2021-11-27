package PractiseSet2;

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();
        int temp = n,s = 0;
        while(n!=0)
        {
            int r = n%10;
            s = s*10 + r;
            n /= 10;
        }
        if(temp == s)
            System.out.println("Palindrome number");
        else
            System.out.println("Not a Palindrome number");
    }
}
