import java.util.Scanner;

public class StudentDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter marks for 5 subjects:");

        double[] subjectMarks = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Subject " + (i + 1) + ": ");
            subjectMarks[i] = scanner.nextDouble();
        }

        scanner.close();

        double totalMarks = 0;
        for (double mark : subjectMarks) {
            totalMarks += mark;
        }
        double percentage = (totalMarks / (5 * 100)) * 100;

        String division;
        if (percentage >= 60) {
            division = "First Division";
        } else if (percentage >= 50 && percentage <= 59) {
            division = "Second Division";
        } else if (percentage >= 40 && percentage <= 49) {
            division = "Third Division";
        } else {
            division = "Fail";
        }

        System.out.println("Percentage: " + percentage);
        System.out.println("Division: " + division);
    }
}
