import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner myObj = new Scanner(System.in);
    
    System.out.println("Calculator");

    System.out.println("Enter input 1: ");
    float in1 = myObj.nextFloat();
    
    System.out.println("Enter input 2: ");
    float in2 = myObj.nextFloat();

    System.out.println("SUM: " + (in1+in2));
    System.out.println("SUBTRACTION: " + (in1-in2));
    System.out.println("MULTIPLICATION: " + (in1*in2));
    System.out.println("DIVISION: %.2f%n" + (in1/in2));
  }
} 
