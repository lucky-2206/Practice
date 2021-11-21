package MultiThreading;

public class program1 {
    public static void main(String[] args) {
        // using lamda function
        Thread obj=new Thread(()->{});
        Thread obj2=new Thread(()->{});
        obj.start();
        obj2.start();
        obj.setName("Scooby");
        obj2.setName("Shaggy");
        System.out.println(obj.getName());
        System.out.println(obj2.getName());
    }

}
