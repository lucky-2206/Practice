package PracticeSet3;

class AddAmount {
    static int amount = 50;
    AddAmount()
    {
    }
    AddAmount(int a)
    {
        amount += a;
    }
}
public class Program6 {
    public static void main(String[] args) {
        AddAmount obj1 = new AddAmount();
        System.out.println(AddAmount.amount);

        AddAmount obj2 = new AddAmount(12);
        System.out.println(AddAmount.amount);
    }
}
