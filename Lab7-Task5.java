class Student {
    private String name;
    private int rollNumber;
    private static String universityName;
    private static int counter = 0;

    public static int setRollNumber() {
        return ++counter;
    }

    public Student(String name) {
        this.name = name;
        this.rollNumber = setRollNumber();
    }

    public static void setUniversityName(String uniName) {
        universityName = uniName;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("University: " + universityName);
        System.out.println("---------------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        Student.setUniversityName("FAST University");

        Student s1 = new Student("Ali");
        Student s2 = new Student("Sara");
        Student s3 = new Student("Usman");

        s1.display();
        s2.display();
        s3.display();
    }
}
