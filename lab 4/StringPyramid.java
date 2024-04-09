import java.util.Scanner;

public class StringPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Loop to print the pyramid
        for (int i = 1; i <= input.length(); i++) {
            System.out.println(input.substring(0, i));
        }

        scanner.close();
    }
}
