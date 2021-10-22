package Practice1;

public class Book {
    String name,author;
    double price;
    int qtyinStock;

    public Book(String name, String author, double price, int qtyinstock)
    {
        this.name=name;
        this.author=author;
        this.price=price;
        this.qtyinStock=qtyinstock;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getQtyinStock() {
        return qtyinStock;
    }

    public static void main(String[] args) {
        Book ob = new Book("Rich Dad poor Dad","Robert Kiyosaki",555.98,100);
        System.out.println(ob.getName());
        System.out.println(ob.getAuthor());
        System.out.println(ob.getPrice());
        System.out.println(ob.getQtyinStock());


    }
}
