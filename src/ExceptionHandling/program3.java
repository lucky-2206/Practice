package ExceptionHandling;

import java.util.*;
class NvalueException extends Exception {
    NvalueException(String s)
    {
        super(s);
    }

}
public class program3
{
    int m1,m2,m3;
    String name;
    program3(String name, int m1,int m2,int m3)
    {
        this.name= name;
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
    }
    public void check(String name,int m1,int m2,int m3) throws NvalueException{
        if((m1>=0 && m1<=100) && (m2>=0 && m2<=100) && (m3>=0 && m3<=100)){
            System.out.println("The average marks of "+name+" are : "+(m1+m2+m3)/3.0);
        }
        else
        {
            throw new NvalueException("Entered value is invalid!");
        }
    }
    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        try{
            System.out.println("Enter the details of first student : ");
            program3 obj1 = new program3(ss.next(), Integer.parseInt(ss.next()),Integer.parseInt(ss.next()),Integer.parseInt(ss.next()));
            System.out.println("Enter the details of the second student : ");
            program3 obj2 = new program3(ss.next(),Integer.parseInt(ss.next()),Integer.parseInt(ss.next()),Integer.parseInt(ss.next()));
            obj1.check(obj1.name, obj1.m1, obj1.m2,obj1.m3);
            obj2.check(obj2.name,obj2.m1,obj2.m2,obj2.m3);
        }
        catch(NumberFormatException e){
            System.out.println(e);
        }
        catch(NvalueException e){
            System.out.println(e);
        }
    }

}

