package Practice1;
import java.util.*;
public class Q1 {
    String name;
    public Q1() {
        System.out.println("When no parameter is passed");
        name = "Unknown";

    }
    public Q1(String st)
    {
        System.out.println("When parameter is passed");
        name = st;
    }
    public void print()
    {
        System.out.println(name);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s= sc.nextLine();
        Q1 ob = new Q1();
        ob.print();
        Q1 obj = new Q1(s);

        obj.print();
    }
}
