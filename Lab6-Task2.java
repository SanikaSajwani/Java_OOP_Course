import java.util.Scanner;

public class Student {
    private int studentID;
    private String name;
    private float cgpa;
    private String department;

    public Student(int id, String name, float cgpa, String dept) {
        this.studentID = id;
        this.name = name;
        this.cgpa = cgpa;
        this.department = dept;
    }

    public Student(int id) {
        Scanner sc = new Scanner(System.in);
        this.studentID = id;
        System.out.print("Enter name: ");
        this.name = sc.nextLine();
        System.out.print("Enter CGPA: ");
        this.cgpa = sc.nextFloat();
        sc.nextLine(); // consume newline
        System.out.print("Enter department: ");
        this.department = sc.nextLine();
    }

    public Student(float cgpa) {
        this.cgpa = cgpa;
    }

    public Student(Student s) {
        this.studentID = s.studentID;
        this.name = s.name;
        this.cgpa = s.cgpa;
        this.department = s.department;
    }

    public void display() {
        System.out.println("ID: " + studentID + ", Name: " + name + ", CGPA: " + cgpa + ", Department: " + department);
    }

    public static void main(String[] args) {
        Student s1 = new Student(1, "Ali", 3.4f, "CS");
        Student s2 = new Student(2);
        Student s3 = new Student(3.7f);
        Student s4 = new Student(s1); 

        s1.display();
        s2.display();
        s3.display();
        s4.display();
    }
}
