package PracticeSet3;

import java.util.*;
public class Program10 {
    public boolean search(int arr[],int search_element)
    {
        for (int j : arr) {
            if (j == search_element)
                return true;
        }
        System.out.println("element not found");
        return false;
    }
    public static void main(String[] args) {
        int arr[]={1,3,5,7,9,11,13,15,17,19};
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number to search");
        int n=s.nextInt();
        Program10 obj=new Program10();
        System.out.println(obj.search(arr,n));
    }
}
