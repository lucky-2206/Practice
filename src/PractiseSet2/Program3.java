package PractiseSet2;

public class Program3 {
    public static void main(String[] args) {
        int[] arr = new int[52];
        int k=0;
        for(int i=0;i<26;i++)
            arr[k++] = i+65;
        for(int i=0;i<26;i++)
            arr[k++] = i+97;

        for(var i:arr){
            System.out.print((char)i);
            System.out.print(" ");
        }
    }
}
