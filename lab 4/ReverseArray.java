public class ReverseArray {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };

        System.out.println("Original array:");
        printArray(numbers);

        System.out.println("\nArray in reverse order:");
        printReverseArray(numbers);
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println(); 
    }

    public static void printReverseArray(int[] arr) {
        for (int i = arr.length-1;i>=0;i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); 
    }
}
