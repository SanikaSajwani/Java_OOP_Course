package com.mycompany.mavenproject2;
import java.util.Scanner;

/**
 *
 * @author smssa
 */
class Person {
    String name, nationality, address, age, cnic;
    
    // Use a static scanner to prevent multiple instances
    static Scanner sc = new Scanner(System.in);

    public Person() {
        System.out.println("I am a person.");
    }
    
    public void input() {
        System.out.print("Enter Name: "); 
        name = sc.nextLine();
        
        System.out.print("Enter Age: "); 
        age = sc.nextLine();
        
        System.out.print("Enter Nationality: "); 
        nationality = sc.nextLine();
        
        // Optimized CNIC validation
        do {
            System.out.print("CNIC No (13 digits): "); 
            cnic = sc.nextLine();
            if (cnic.length() != 13) {
                System.out.println("Invalid! CNIC should be exactly 13 digits.");
            }
        } while (cnic.length() != 13);
        
        System.out.print("Enter Address: "); 
        address = sc.nextLine();
    }
    
    public void output() {
        System.out.println("\nPerson Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Nationality: " + nationality);
        System.out.println("CNIC No: " + cnic);
        System.out.println("Address: " + address);
    }
}

class Employee extends Person {
    String companyName, companyLocation, experience;

    public Employee() {
        super();
        System.out.println("I am an Employee.");
    }
    
    public void input1() {
        super.input();
        
        System.out.print("Company Name: "); 
        companyName = sc.nextLine();
        
        System.out.print("Company Location: "); 
        companyLocation = sc.nextLine();
        
        System.out.print("Years of Experience: "); 
        experience = sc.nextLine();
    }
    
    public void output1() {
        super.output();
        System.out.println("\nEmployee Details:");
        System.out.println("Company Name: " + companyName);
        System.out.println("Company Location: " + companyLocation);
        System.out.println("Years of Experience: " + experience);
    }
}

class Manager extends Employee {
    String[] employeesUnder;

    public Manager() {
        super();
        System.out.println("I am a Manager.");
    }
    
    public void input2() {
        super.input1();
        
        employeesUnder = new String[5];
        System.out.println("Enter names of 5 employees under supervision:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Employee " + (i + 1) + ": ");
            employeesUnder[i] = sc.nextLine();
        }
    }
    
    public void output2() {
        super.output1();
        
        System.out.println("\nEmployees Under Supervision:");
        for (String emp : employeesUnder) {
            System.out.println("- " + emp);
        }
    }
}

public class Mavenproject2 {
    public static void main(String[] args) {
        Manager mgr = new Manager();
        mgr.input2();
        mgr.output2();
    }
}
