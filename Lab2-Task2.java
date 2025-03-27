import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner myObj = new Scanner(System.in);
    
    System.out.println("Average Marks");

    System.out.println("Enter Mathematics Marks: ");
    float math = myobj.nextFloat();
    
    System.out.println("Enter Science Marks: ");
    float sci = myobj.nextFloat();

    System.out.println("Enter English Marks: ");
    float eng = myobj.nextFloat();

    System.out.println("Enter PST Marks: ");
    float pst = myobj.nextFloat();

    float average = (math + sci + eng + pst)/4;
    System.out.println("Average Marks: " + average);
    }
  }
