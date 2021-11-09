package com.company;

//Way 1:
public class outer {
    static int n2=20;
    public static class inner
    {
        int n2=30;
        public void display() {
            int n2=40;
            System.out.println(n2);
            System.out.println(this.n2);
            System.out.println(outer.n2);
        }
    }

    public static void main(String[] args) {
        outer.inner obj = new outer.inner();
        obj.display();
    }
}

//way 2
/*package com.company;

public class outer {
    int n2=20;
     class inner
    {
        int n2=30;
        public void display() {
            int n2=40;
            System.out.println(n2);
            System.out.println(this.n2);
            System.out.println(outer.this.n2);
        }
    }

    public static void main(String[] args) {
         outer ob =new outer();
         outer.inner ob1 = ob.new inner();
        //we can write these statement in one line as:
        // outer.inner obj = new outer().new inner();
        ob1.display();
    }
}
 */
