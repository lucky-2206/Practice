package PractiseSet2;

public class Program5 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 1, 4};
        boolean b = true;
        for (var i:arr) {
            if(i != 1 && i != 4){
                b = false;
                break;
            }
        }
        System.out.println(b);
    }
}
