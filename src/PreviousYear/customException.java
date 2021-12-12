package PreviousYear;

import java.util.Scanner;

class MarksOutOfBoundException extends Exception {
    public MarksOutOfBoundException(String st)
    {
        super(st);
    }
}
public class customException {
    public static void main(String[] args) {
        int marks;
        Scanner sc = new Scanner(System.in);
        marks = sc.nextInt();
        try
        {
            if(marks>100)
                throw new MarksOutOfBoundException("Marks>100");
        }
        catch (MarksOutOfBoundException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
