import java.util.Scanner;

public class CountVowelsConsonants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a line of text: ");
        String inputLine = scanner.nextLine();

        scanner.close();

        String lowercaseLine = inputLine.toLowerCase();

        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < lowercaseLine.length(); i++) {
            char ch = lowercaseLine.charAt(i);
            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
    }
}
