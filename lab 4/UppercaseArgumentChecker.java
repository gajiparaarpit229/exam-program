public class UppercaseArgumentChecker {
    public static void main(String[] args) {
        boolean errorFound = false;
        for (String arg : args) {
            if (!Character.isUpperCase(arg.charAt(0))) {
                System.out.println("Error: Argument '" + arg + "' does not begin with an uppercase letter.");
                errorFound = true;
                break;
            }
        }

        if (!errorFound) {
            System.out.println("All arguments begin with an uppercase letter.");
        }
    }
}
