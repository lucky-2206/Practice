package Practice1;

import java.util.Scanner;

public class menudriven {

    public static void primecalc(int n) {
        int f = 0;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                f = 1;
                break;
            }
        }
        if (f == 0)
            System.out.println(n + " is prime");
        else
            System.out.println(n + " is not prime");
    }

    public static void factcalc(int n) {

        int f = 1;
        for (int i = 1; i <= n; i++)
            f *= i;

        System.out.println("Factorial of " + n + " is " + f);
    }

    public static void fibprint(int n) {
        if (n == 1)
            System.out.println("0 ");
        else if (n == 2)
            System.out.println("1 ");
        else {
            int a = 0;
            int b = 1;
            int c;
            System.out.print(a+" "+b+" ");
            for (int i = 2; i <= n; i++) {
                c = a + b;
                System.out.print(c + " ");
                a = b;
                b = c;
            }
        }
        System.out.println();
    }

    public static void menu() {
        System.out.println("Menu:");
        System.out.println("Press 1 for prime number:");
        System.out.println("press 2 for factorial:");
        System.out.println("Press 3 for fibonacci series:");
        System.out.println("Press 4 for exit");
    }

    public static void input() {
        Scanner sc = new Scanner(System.in);
        menu();
        int ch = sc.nextInt();
        int n=1;
        if(ch==1||ch==2||ch==3) {
            System.out.println("Enter the number");
             n = sc.nextInt();
        }

            switch (ch) {
                case 1:
                    primecalc(n);
                    break;
                case 2:
                    factcalc(n);
                    break;
                case 3:
                    fibprint(n);
                    break;
                case 4:
                    System.exit(0);
            }

    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
    int chances =3;
        while(true) {
            System.out.println("Press Y to start:");
            char c = sc.next().charAt(0);

            if (c == 'Y')
                input();
            else {
                System.out.println("Invalid input");
                chances--;
                System.out.println(chances+"/3 chances left");
                if(chances==0)
                    break;

            }
        }
        if(chances==0)
            System.out.println("Max wrong input limit reached");



        }
    }

