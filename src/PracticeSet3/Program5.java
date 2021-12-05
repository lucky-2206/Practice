package PracticeSet3;

class Student{
    String name,address;int age;
    Student()
    {
        name ="unknown";
        age=0;
        address="not available";
    }
    public void setInfo(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    public void setInfo(String name,int age,String address)
    {
        this.name=name;
        this.age=age;
        this.address=address;
    }
}

public class Program5 {
    public static void main(String[] args) {
        Student obj[]=new Student[10];
        for (int i=0;i<10;i++)
        {
            obj[i]=new Student();
        }
        obj[2].setInfo("kunal",18,"Mathura");
        obj[5].setInfo("gagan",19,"Mathura");
        obj[7].setInfo("Tanmay",19,"Aligarh");
        obj[1].setInfo("Ayush",19,"Hathras");
        obj[3].setInfo("Vaibhav",19,"Mathura");
        obj[0].setInfo("Nandini",18);
        obj[4].setInfo("Vikas",18);
        obj[9].setInfo("Harsh",18);
        for (int i=0;i<10;i++)
        {
            System.out.println(obj[i].name+"  "+obj[i].age+"  "+obj[i].address);
        }
    }
}
