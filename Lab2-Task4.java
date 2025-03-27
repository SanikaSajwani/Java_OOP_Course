import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner myObj = new Scanner(System.in);

    System.out.println("N-th Term");

    System.out.print("Enter Common Difference: ");
    float cd = myObj.nextFloat(); 
    
    System.out.print("Enter First Term: ");
    float ft = myObj.nextFloat(); 

    float n = 0;
    float nterm = ft - ((n - 1) * cd);
    System.out.println("Nth Term of Arithmetic Series: " + nterm);
  }
} 
