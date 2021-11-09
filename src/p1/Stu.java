package p1;

public class Stu {
    public int a;
    public   String st;
    public Stu()
    {
        a=0;
        st = "";
    }
    public Stu(int a, String st) {
        this.a = a;
        this.st = st;
    }
    public void print()
    {
        System.out.println(a);
        System.out.println(st);

    }

    public static void main(String[] args) {
        Stu ob = new Stu(63,"Vaibhav");
        ob.print();
    }

}
