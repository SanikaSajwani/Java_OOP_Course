public class StudentMarks {
    public static void main(String[] args) {
        int[] marks = {45, 78, 62, 90, 49}; 
        int sum = 0, count = 0;

        System.out.println("All Students' Marks:");
        for (int mark : marks) {
            System.out.println(mark);
        }

        System.out.println("\nValid Marks (50 and above):");
        for (int mark : marks) {
            if (mark >= 50) {
                System.out.println(mark);
                sum += mark;
                count++;
            }
        }

        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Average of marks (>= 50): " + average);
        } else {
            System.out.println("No student has marks >= 50.");
        }
    }
}
