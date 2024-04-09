public class ArrayAverage {
    public static void main(String[] args) {
        int[] numbers = { 5, 10, 15, 20 };

        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }

        double average = (double) sum / numbers.length;

        System.out.println("Array elements: " + java.util.Arrays.toString(numbers));
        System.out.println("Average: " + average);
    }
}
