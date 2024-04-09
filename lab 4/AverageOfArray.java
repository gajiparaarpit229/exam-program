public class AverageOfArray {
    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40};

        double sum = 0;
        for (int num : array) {
            sum += num;
        }

        double average = sum / array.length;
        System.out.println("Average of the array elements is: " + average);
    }
}
