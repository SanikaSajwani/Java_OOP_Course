
class Course {
    protected String course_Name, course_Code, course_Venue;
    protected int credit_Hours;

    public Course(String name, String code, String venue, int hours) {
        this.course_Name = name;
        this.course_Code = code;
        this.course_Venue = venue;
        this.credit_Hours = hours;
    }
}

class JavaCourse extends Course {
    String teacher_Name;

    public JavaCourse(String name, String code, String venue, int hours) {
        super(name, code, venue, hours);  
        this.teacher_Name = "Miss Sara";  
    }

    public void display(){
        System.out.println("Course Name: " + course_Name);  
        System.out.println("Course Code: " + course_Code);
        System.out.println("Course Venue: " + course_Venue);
        System.out.println("Credit Hours: " + credit_Hours);
        System.out.println("Teacher Name: " + teacher_Name);
    }
 }

public class Task1 {
    public static void main(String[] args){
        JavaCourse jc = new JavaCourse("Programming Fundamentals", "CS1002", "Lab 6", 1);
        jc.display();   
    }
}
