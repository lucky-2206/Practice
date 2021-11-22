package ExceptionHandling;

public class CatchBlock {
    public static void main(String[] args) {
        int a=58;
        int b =0;
        try {
            int c = a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e)
        {
            //System.out.println(e.getMessage());     // output --->  / by zero

            //e.printStackTrace();          //output --->  java.lang.ArithmeticException: / by zero
                                                        // at ExceptionHandling.CatchBlock.main(CatchBlock.java:8)

            System.out.println(e.toString());    //output ---> java.lang.ArithmeticException: / by zero
        }

    }
}
