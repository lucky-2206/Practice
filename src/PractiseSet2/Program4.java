package PractiseSet2;

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter array elements: ");
        int s = 0,c=1,temp = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] == 6)
            {
                c = 0;
                s += arr[i];
            }
            if (arr[i] == 7) {
                c = 1;
                temp = 0;
                s += arr[i];
            }
            if (c == 1 && arr[i] != 6 && arr[i] != 7) s += arr[i];
            if (c == 0 && arr[i] != 6)
            {
                temp += arr[i];
            }
        }
        if(c == 0) s += temp;
        System.out.print("Sum: ");
        System.out.println(s);
    }
}
