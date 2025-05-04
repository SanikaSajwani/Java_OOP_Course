public class Rectangle {
    private int length;
    private int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int Area() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(4, 5);
        Rectangle rect2 = new Rectangle(5, 8);

        System.out.println("Area of rectangle 1: " + rect1.Area());
        System.out.println("Area of rectangle 2: " + rect2.Area());
    }
}
