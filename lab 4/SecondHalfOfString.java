import java.util.Scanner;

public class SecondHalfOfString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String inputString = scanner.nextLine();

        scanner.close();

        int length = inputString.length();

        int startIndex = length / 2;

        System.out.println("Length of the string: " + length);
        System.out.println("Second half of the string: " + inputString.substring(startIndex));
    }
}
