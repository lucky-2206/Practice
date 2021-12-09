package PracticeSet3;

import java.util.Scanner;

public class Number {
    private int num;
    Number(int num) {
        this.num=num;
    }
    boolean isZero() {
        return num == 0;
    }
    boolean isPositive() {
        return num > 0;
    }
    boolean isNegative() {
        return num < 0;
    }
    boolean isOdd() {
        return num % 2 != 0;
    }
    boolean isEven() {
        return num % 2 == 0;
    }
    boolean isPrime() {
        if(num>1)
        {
            int f=0;
            for(int i=2;i*i<=num;i++)
            {
                if(num%i==0)
                {
                    f=1;
                    break;
                }
            }
            return (f == 0);
        }
        else
            return false;
    }
    boolean isArmstrong()
    {
        int l=(Integer.toString(num)).length(); // to find number of digits in the number
        int copy=num,sum=0;
        while(copy>0)
        {
            int temp = copy%10;
            sum+= (int)(Math.pow(temp,l));
            copy/=10;
        }
        return (sum == num);
    }
    int getFactorial()
    {
        int fact=1;
        for(int i=2;i<=num;i++){
            fact *=i;
        }
        return fact;
    }
    int getSqrt() {
        return (int)Math.sqrt(num);
    }
    int getSqr() {
        return num*num;
    }
    int sumDigits() {
        int sum=0,copy=num;
        while(copy!=0)
        {
            int temp = copy%10;
            sum+=temp;
            copy /=10;
        }
        return sum;
    }
    String dispBinary() {
        return Integer.toBinaryString(num);
    }
    String dispOctal() {
        return Integer.toOctalString(num);
    }
    String dispHexa() {
        return Integer.toHexString(num);
    }

    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        Number obj=new Number(num);
        System.out.println("Is number zero?  "+obj.isZero());
        System.out.println("Is number positive?  "+obj.isPositive());
        System.out.println("Is number negative?  "+obj.isNegative());
        System.out.println("Is number odd?  "+obj.isOdd());
        System.out.println("Is number even?  "+obj.isEven());
        System.out.println("Is number prime?  "+obj.isPrime());
        System.out.println("Is number armstrong?  "+obj.isArmstrong());
        System.out.println("Factorial of the number is =  "+obj.getFactorial());
        System.out.println("Square root of the number is =  "+obj.getSqrt());
        System.out.println("Square of the number is =  "+obj.getSqr());
        System.out.println("Sum of the digit of the number is =  "+obj.sumDigits());
        System.out.println("Binary of the number is =  "+obj.dispBinary());
        System.out.println("Octal of the number is =  "+obj.dispOctal());
        System.out.println("Hexadecimal of the number is =  "+obj.dispHexa());
    }
}
