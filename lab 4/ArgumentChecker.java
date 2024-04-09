public class ArgumentChecker {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Error: No command-line arguments provided.");
            System.exit(1);
        }
        for (String arg : args) {
            if (!startsWithUpperCase(arg)) {
                System.out.println("Error: Argument '" + arg + "' does not start with an uppercase letter.");
                System.exit(1);
        }
        System.out.println("All command-line arguments start with an uppercase letter.");
    }
        public static boolean startsWithUpperCase(String str) {
        return !str.isEmpty() && Character.isUpperCase(str.charAt(0));
    }
}
