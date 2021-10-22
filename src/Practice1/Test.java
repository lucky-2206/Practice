package Practice1;

 class Student {
    String name;
    double per;

    public Student(String name,double per)
    {
        this.name = name;
        this.per = per;
    }
    public void display()
    {
        System.out.println("Name = "+ name);
        System.out.println("Percentage = +"+per);
    }
}
public class Test
{
    public static void main(String[] args) {
        Student ob1 = new Student("Ram",95.2);
        Student ob2 = new Student("Shyam",85.23);
        Student ob3 = new Student("Mohan",88.8);
        if(ob1.per>ob2.per&&ob1.per> ob3.per)
            ob1.display();
        else if(ob2.per>ob1.per&&ob2.per>ob3.per)
            ob2.display();
        else
            ob3.display();

    }
}
