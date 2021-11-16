package ExceptionHandling;

import java.util.Scanner;

public class tryWithResources {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in))
        {
            int a = sc.nextInt();
            System.out.println("Entered value is: "+a);
        }
        catch(Exception e) {
            System.out.println(e);
        }
    }
}
