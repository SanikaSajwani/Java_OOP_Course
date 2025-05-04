// Job.java
public class Job {
    private String role;
    private int id;
    private double salary;

    public Job() { }

    public Job(String role, int id, double salary) {
        this.role = role;
        this.id = id;
        this.salary = salary;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

// Person.java
public class Person {
    private Job job;

    public Person(String role, int id, double salary) {
        job = new Job(role, id, 0);
        job.setSalary(salary);
        System.out.println("Inside Person constructor: salary set to " + job.getSalary());
    }

    public Job getJob() {
        return job;
    }
}

// Main.java
public class Main {
    public static void main(String[] args) {
        Person Shazen = new Person("Developer", 1234, 85000.0);

        double sal = Shazen.getJob().getSalary();
        System.out.println("Shazen's salary is: " + sal);
    }
}
