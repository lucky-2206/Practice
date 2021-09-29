package com.company;

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