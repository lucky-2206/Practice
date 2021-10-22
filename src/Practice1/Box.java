package Practice1;

public class Box {
    double l,b,h;

    public Box(double l,double b,double h)
    {
        this.l =l;
        this.b=b;
        this.h=h;
    }
    public double vol() {
        return l * b * h;
    }

    public static void main(String[] args) {
        Box ob = new Box(5.2,3.7,6.2);
        System.out.println("voluume = "+ob.vol());
    }

}
