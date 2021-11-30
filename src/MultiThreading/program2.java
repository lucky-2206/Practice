package MultiThreading;

import java.util.Random;
class Mythread implements Runnable
{
    public void run()
    {
        String[] colours={"white","blue","black","green","red","yellow"};
        Random obj = new Random();
        while(true)
        {
            int i = obj.nextInt(5);
            if(colours[i].equals("red"))
                break;
            System.out.println(colours[i]);
        }
    }
}
public class program2 {
    public static void main(String[] args) {
        Mythread obj = new Mythread();
        Thread obj2 = new Thread(obj);
        obj2.start();


    }
}
