/*Create a thread which prints 1 to 10. After printing 5, there should be a delay of 5000 milliseconds
before printing 6.  ( Thread Control Mechanism concept)
 */

package MultiThreading;


class mythread extends Thread
{
    public void run()
    {}
}
public class lab1 {
    public static void main(String[] args) {
        mythread obj = new mythread();
        obj.start();
        for(int i=1;i<=10;i++)
        {
            try {
                if (i == 6)
                    Thread.sleep(5000);
                System.out.print(i + " ");
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
