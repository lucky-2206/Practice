package ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class labpg2 {

    public static void genArithmetic() {
        System.out.println("Arithmetic Exception:");
        int a = 6;
        int b = 0;
        try {
            int c = a / b;
            System.out.println(c);
        } catch (ArithmeticException e) {
            System.out.println(e.toString());
        }
    }

    public static void genarrayoutofbound() {
        System.out.println("Array out of bound Exception:");

        int a[] = {1, 2, 3, 4, 5};
        try {
            System.out.println(a[8]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());
        }
    }

    public static void genstringoutofbound() {
        System.out.println("string index out of bound Exception:");

        String st = "Vaibhav";
        try {
            System.out.println(st.charAt(15));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e.toString());
        }
    }

    public static void gennullpointer() {
        System.out.println("null pointer Exception:");

        Integer i1 = null;
        try {
            int i2 = i1;
        } catch (NullPointerException e) {
            System.out.println(e.toString());
        }
    }

    public static void gennumberformat() {
        System.out.println("Number format Exception:");
        try {
            Integer i1 = new Integer("abc");
        } catch (NumberFormatException e) {
            System.out.println(e.toString());
        }
    }

    public static void genfilenotfound() throws FileNotFoundException {

            FileReader file = new FileReader("C:\\test\\a.txt");
    }


    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("-----------------------------------------------");
        System.out.println("Menu");
        System.out.println("Press 1 for unchecked Exception");
        System.out.println("Press 2 for checked Exception");
        System.out.println("-----------------------------------------------");
        int c = sc.nextInt();
        if (c == 1) {
            System.out.println("-----------------------------------------------");
            System.out.println("Menu");
            System.out.println("Press 1 for Arithmetic exception");
            System.out.println("Press 2 for Array out of bound exception");
            System.out.println("Press 3 for String out of bound exception");
            System.out.println("Press 4 for Null pointer exception");
            System.out.println("Press 5 for Number format exception");
            System.out.println("-----------------------------------------------");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    genArithmetic();
                    break;
                case 2:
                    genarrayoutofbound();
                    break;
                case 3:
                    genstringoutofbound();
                    break;
                case 4:
                    gennullpointer();
                    break;
                case 5:
                    gennumberformat();
            }
        } else {
            System.out.println("-----------------------------------------------");
            System.out.println("Menu");
            System.out.println("Press 1 for FileNotFound Exception");
            System.out.println("Press 2 for Input-Output exception");
//            System.out.println("Press 3 for String out of bound exception");
//            System.out.println("Press 4 for Null pointer exception");
//            System.out.println("Press 5 for Number format exception");
            System.out.println("-----------------------------------------------");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    try {
                        genfilenotfound();
                    }
                    catch
                {

                }
                    break;
                case 2:
                    genIobound();
                    break;

            }
        }
    }
}
