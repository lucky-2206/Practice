package WrapperClass;
import java.util.*;
public class prog2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("Given Number " + n);
        System.out.println("Binary Equivalent " + Integer.toBinaryString(n));
        System.out.println("Octal Equivalent " + Integer.toOctalString(n));
        System.out.println("Hexa Decimal Equivalent " + Integer.toHexString(n));

    }
}
