package ExceptionHandling;

public class program2 {
    public static void main(String[] args) {
        int arr[] = new int[args.length];
        int sum=0;
        try{
            for(int i=0;i<args.length;i++){
                arr[i] = Integer.parseInt(args[i]);
                sum += arr[i];
            }
            System.out.println("Total of the entered values : "+sum);
            System.out.println("Average of the entered numbers is : "+sum/5.0);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
