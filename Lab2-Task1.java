import java.util.Scanner;

public class Main {
  public static void main (String[] args) {
    Scanner myObj = new Scanner(System.in);

    System.out.println("Properties of a Circle: ");
    
    System.out.print("Enter Radius: ");
    double rad = myObj.nextDouble();

    double area = 3.14 * rad * rad;
    double diam = rad + rad;
    double circum = 2 * 3.14 * rad;

    System.out.println("Area of the Circle: " + area);
    System.out.println("Diameter of the Circle: " + diam);
    System.out.println("Circumference of the Circle: " + circum);
  }
}
