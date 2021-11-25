package PracticeSet1;

public class Student2 {
    String name;
    float percentage;

    public Student2(String name, float percentage) {
        this.name = name;
        this.percentage = percentage;
    }
    public String getName() {
        return name;
    }
    public float getPercentage() {
        return percentage;
    }

    public static void main(String[] args) {
        Student2 s1 = new Student2("Vaibhav",93.2f);
        Student2 s2 = new Student2("kunal",90.5f);
        Student2 s3 = new Student2("Gagan",90.2f);
        float m = Math.max(Math.max(s1.getPercentage(), s2.getPercentage()), s3.getPercentage());
        System.out.println("Topper name and percentage:");
        if(m== s1.getPercentage()){
            System.out.println(s1.getName());
            System.out.println(s1.getPercentage());
        }

        else if(m== s2.getPercentage()){
            System.out.println(s2.getName());
            System.out.println(s2.getPercentage());
        }

        else{
            System.out.println(s3.getName());
            System.out.println(s3.getPercentage());
        }
    }

}
