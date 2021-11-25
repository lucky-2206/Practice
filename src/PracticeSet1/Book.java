package PracticeSet1;

//Question 2
public class Book {
    String name,author;
    int qty;
    double price;
    Book(String name,String author,int qty,double price){
        this.name = name;
        this.author = author;
        this.qty = qty;
        this.price = price;
    }
    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getQty() {
        return qty;
    }

    public double getPrice() {
        return price;
    }
    public static void main(String[] args) {
        Book b1 = new Book("OS","Galvin",40,700);
        Book b2 = new Book("DSA","Narshima Kurumanchi",5,1500);
        System.out.println("Details Book 1:");
        System.out.println(b1.getName());
        System.out.println(b1.getAuthor());
        System.out.println(b1.getQty());
        System.out.println(b1.getPrice());
        System.out.println("Details Book 2:");
        System.out.println(b2.getName());
        System.out.println(b2.getAuthor());
        System.out.println(b2.getQty());
        System.out.println(b2.getPrice());
    }
}

