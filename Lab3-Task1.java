// BMI Calculator 
import java.util.*;

public class BMICalc {
  public static void main (String[] args) {
    Scanner s = new Scanner(System.in);

    System.out.print("Enter your weight in Kg: ");
    double weight = s.nextDouble();
    System.out.print("Enter your height in Meters: ");
    double height = s.nextDouble();

    double bmi = weight / (height * height);
    System.out.printf("Your BMI: %.2f \n", bmi);

    if(bmi < 18.5) { System.out.println("Underweight");
    } else if (bmi >= 18.5 && bmi <= 24.9) { System.out.println("Normal");
    } else if (bmi >= 25 && bmi <= 29.9) { System.out.println("Overweight");
    }  else { System.out.println("Obese"); 
    }

    System.out.println("\n    BMI Classification Table      ");
    System.out.println("------------------------------------");
    System.out.println("| BMI Range        |   Category    |");
    System.out.println("------------------------------------");
    System.out.println("| Less than 18.5   |   Underweight |");
    System.out.println("| 18.5-24.9        |   Normal      |");
    System.out.println("| 25-29.9          |   Overweight  |");
    System.out.println("| 30 or above      |   Obese       |");
    System.out.println("------------------------------------");
    }
}



    
    
