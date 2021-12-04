package PracticeSet3;

public class Program3 {
    static int icount;
    {
        icount++;
    }

    public static void main(String[] args) {
        for(int i = 0; i<10; i++)
            new Program3();
        System.out.println("No. of total instances = "+Program3.icount );
    }
}
