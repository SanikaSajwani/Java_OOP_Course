import java.util.*;

class Employee {
  String name, position;
  float years;
  double salary = 30000;

void Employee(){
  System.out.println("I am an Employee.");
}

void input(){
  Scanner s = new Scanner(System.in);
  System.out.print("Enter your Name: "); name = s.nextLine();
  System.out.print("Enter your Position: "); position = s.nextLine();
  System.out.print("Enter Number of Years of Service: "); years =  s.nextFloat();
}

void output(){
  System.out.println("\nYour Name: " + name); 
  System.out.println("Your Position: " + position);
  System.out.println("Your Number of Years of Service: " + years);
  // System.out.println("Your Salary: " + salary); 
}
}

class FullTimeEmployee extends Employee {
  double increment = 0.2;

    void FullTimeEmployee(){
     System.out.println("\nI am a Full Time Employee in the company.");
    }

    @Override 
     void output(){
     super.output();
    double incremented_salary = salary + ((salary)*(increment));
    System.out.println("Your Incremented Salary: " + incremented_salary);
    }
}

class PartTimeEmployee extends Employee {
  double increment = 0.05;

void PartTimeEmployee(){
  System.out.println("\nI am a Part Time Employee in the company.");
}

@Override 
  void output(){
  super.output();
  double incremented_salary = salary + ((salary)*(increment));
  System.out.println("Your Incremented Salary: " + incremented_salary);
}
}

public class Lab9{
  public static void main(String[] args){
      
    FullTimeEmployee fte = new FullTimeEmployee();
    fte.FullTimeEmployee();
    fte.input(); fte.output();
    
    PartTimeEmployee pte = new PartTimeEmployee();
    pte.PartTimeEmployee();
    pte.input(); pte.output();
    }
}
