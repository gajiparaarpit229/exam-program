import java.util.Scanner;

public class NumberValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of integers: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];

        System.out.println("Enter " + n + " integers:");

        for (int i = 0; i < n; i++) {
            try {
                int num = scanner.nextInt();
                validateNumber(num);
                numbers[i] = num;
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.nextLine(); // Consume the invalid input
                i--; // Decrement i to re-enter the current number
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                i--; // Decrement i to re-enter the current number
            }
        }

        System.out.println("Valid numbers:");
        for (int number : numbers) {
            System.out.println(number);
        }

        scanner.close();
    }

    public static void validateNumber(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("Number cannot be negative.");
        }
        if (num % 10 == 0) {
            throw new IllegalArgumentException("Number cannot be evenly divisible by 10.");
        }
        if (num > 1000 && num < 2000) {
            throw new IllegalArgumentException("Number cannot be greater than 1000 and less than 2000.");
        }
        if (num > 7000) {
            throw new IllegalArgumentException("Number cannot be greater than 7000.");
        }
    }
}
