public class CommandLineSum {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java CommandLineSum <number1> <number2>");
            System.exit(1); 
        }

        try {
            double num1 = Double.parseDouble(args[0]);
            double num2 = Double.parseDouble(args[1]);

            double sum = num1 + num2;
            System.out.println("Sum: " + sum);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input. Please enter valid numbers.");
            System.exit(1);
        }
    }
}
