package PractiseSet2;

public class Program6 {
    public static void main(String[] args) {
        if(args.length != 4) System.out.println("Enter 4 integer numbers");
        else{
            for (int i = args.length-1; i >= 0 ; i--) {
                if(i == args.length/2 - 1) System.out.println();
                System.out.print(args[i]);
                System.out.print(" ");
            }
        }
    }
}
