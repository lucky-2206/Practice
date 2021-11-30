package MultiThreading;

class Mythread1 implements Runnable
{
    public void run()
    {
        for(int i=1;i<=20;i+=2) //Odd numbers printing
            System.out.print(i+" ");
        System.out.println();
    }

}
public class Program3 {
    public static void main(String[] args) {
        Mythread1 obj = new Mythread1();
        Thread ob = new Thread(obj);
        ob.start();
        try {
            ob.join();
        }
        catch (InterruptedException e)
        {
            System.out.println(e.getMessage());
        }
        for(int i=2;i<=20;i+=2) //Even numbers printing
            System.out.print(i+" ");
        System.out.println();

    }
}
