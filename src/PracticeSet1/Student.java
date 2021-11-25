package PracticeSet1;

//Question 1
public class Student {
    String stuName;
    int rollNo;
    Student(){
        rollNo = 0;
        stuName = "Unknown";
    }

    Student(String name,int roll){
        rollNo = roll;
        stuName = name;
    }
    public static void main(String[] args) {
        Student stu1 = new Student("kunal",26);
        Student stu2 = new Student();
        Student stu3 = new Student("Vaibhav",63);
        System.out.println(stu1.stuName+" "+stu1.rollNo);
        System.out.println(stu2.stuName+" "+stu2.rollNo);
        System.out.println(stu3.stuName+" "+stu3.rollNo);
    }
}
