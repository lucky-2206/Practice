package PracticeSet1;

public class Box {
    int width, height, depth;

    public Box(int width, int height, int depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    public int volume() {
        return width * height * depth;
    }


    public static void main(String[] args) {
        Box ob = new Box(7, 15, 12);
        System.out.println("volume of the box is equal to = "+ob.volume()+" unit cube");
    }
}
