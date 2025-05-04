import java.util.Scanner;

public class Box {
    private int height;
    private int width;

    public Box(int height, int width) {
        if (height > 0 && width > 0) {
            this.height = height;
            this.width = width;
        } else {
            System.out.println("Invalid dimensions.");
        }
    }

    public Box(int height) {
        Scanner sc = new Scanner(System.in);
        this.height = height;
        System.out.print("Enter width: ");
        this.width = sc.nextInt();
    }

    public Box() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height: ");
        this.height = sc.nextInt();
        System.out.print("Enter width: ");
        this.width = sc.nextInt();
    }

    public void display() {
        System.out.println("Height: " + height + ", Width: " + width);
    }

    public static void main(String[] args) {
        Box b1 = new Box(5, 7);
        b1.display();

        Box b2 = new Box(8);
        b2.display();

        Box b3 = new Box();
        b3.display();
    }
}
