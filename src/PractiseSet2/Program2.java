package PractiseSet2;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {5,78,47,12,56,89,31,26,70,100};
        System.out.print("Enter a number to be searched: ");
        int ele = sc.nextInt();
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==ele) {
                index = i;
                break;
            }
        }
        System.out.println(index);
    }
}
