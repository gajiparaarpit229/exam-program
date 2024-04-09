public class PowerCalculator {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: java PowerCalculator <x> <y>");
            return;
        }

        try {
            int x = Integer.parseInt(args[0]);
            int y = Integer.parseInt(args[1]);

            if (x < 0 || y < 0) {
                throw new IllegalArgumentException("x and y must be non-negative integers");
            }

            int result = calculatePower(x, y);
            System.out.println(x + " raised to the power of " + y + " is " + result);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid integers for x and y.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int calculatePower(int x, int y) {
        if (y == 0) {
            return 1;
        }

        int result = x;
        for (int i = 1; i < y; i++) {
            result *= x;
        }
        return result;
    }
}
