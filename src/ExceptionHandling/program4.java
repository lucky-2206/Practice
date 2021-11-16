package ExceptionHandling;
import java.util.*;
    class InvalidCountryException extends Exception
    {
        InvalidCountryException(String s)
        {
            super(s);
        }
    }
    public class program4 {
        void registerUser(String username,String CountryName) throws InvalidCountryException {
            if(CountryName.equalsIgnoreCase("India"))
                System.out.println("User registration done successfully");
            else
                throw new InvalidCountryException("User Outside India cannot be registered");
        }

        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter user name");
            String username=sc.nextLine();
            System.out.println("Enter user Country");
            String CountryName=sc.nextLine();
            program4 obj=new program4();
            try {
                obj.registerUser(username,CountryName);
            }
            catch (InvalidCountryException e)
            {
                System.out.println(e.getMessage());
            }
        }
}
