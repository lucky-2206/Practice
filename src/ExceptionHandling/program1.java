package ExceptionHandling;

import java.util.*;
public class program1 {
    public static void main(String[] args) {
        System.out.println("Enter the value of n : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter array elements : ");

        try{
            for(int i=0;i<n;i++)
                arr[i] = Integer.parseInt(sc.next());
            System.out.println("Enter the index of the array element you want to access : ");
            int ind = sc.nextInt();

                System.out.println("The array element at index "+ind+" = "+arr[ind]);
                System.out.println("the array element successfully accessed");
        }
        catch(NumberFormatException |IndexOutOfBoundsException e){
            System.out.println(e);
        }

        // or we can use the code

//        try{
//            for(int i=0;i<n;i++)
//                arr[i] = Integer.parseInt(sc.nextLine());
//            System.out.println("Enter the index of the array element you want to access : ");
//            int ind = sc.nextInt();
//            try{
//                System.out.println("The array element at index "+ind+" = "+arr[ind]);
//                System.out.println("the array element successfully accessed");
//            }
//            catch(IndexOutOfBoundsException e){
//                System.out.println(e);
//            }
//
//        }
//        catch(NumberFormatException e){
//            System.out.println(e);
//        }
//        System.out.println("reat of the code");



        }
}
