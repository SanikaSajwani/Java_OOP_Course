public class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary > 0 ? monthlySalary : 0.0;
    }

    public double getYearlySalary() {
        return monthlySalary * 12;
    }

    public void raiseSalary(double percent) {
        monthlySalary += monthlySalary * percent / 100;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }
}

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Ali", "Khan", 30000);
        Employee emp2 = new Employee("Sara", "Ahmed", 40000);

        System.out.println(emp1.getFullName() + " yearly salary: " + emp1.getYearlySalary());
        System.out.println(emp2.getFullName() + " yearly salary: " + emp2.getYearlySalary());

        emp1.raiseSalary(10);
        emp2.raiseSalary(10);

        System.out.println("After 10% raise:");
        System.out.println(emp1.getFullName() + " yearly salary: " + emp1.getYearlySalary());
        System.out.println(emp2.getFullName() + " yearly salary: " + emp2.getYearlySalary());
    }
}
