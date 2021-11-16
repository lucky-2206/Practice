package ExceptionHandling;

class InvalidAgeException extends Exception
{
    InvalidAgeException(String s)
    {
        super(s);
    }
}

public class program5 {
    public static void main(String[] args) {
        try {
            int age = Integer.parseInt(args[0]);
            if (age < 18 || age >= 60)
                throw new InvalidAgeException("Age is not greater than or equal to 18 and less then or equal to 60");
            else
                System.out.println("Age entered is between the range");
        } catch (InvalidAgeException | ArrayIndexOutOfBoundsException | NumberFormatException e) {
            System.out.println(e.toString());
        }
    }
}
