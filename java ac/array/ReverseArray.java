package array;

public class ReverseArray {
    public static void main(String[] args) {
        int arr[] = {10, 25, 30, 45, 50, 60};
        System.out.println("Original array:");
        printArray(arr);

        reverseArray(arr);
        System.out.println("Reversed array:");
        printArray(arr);
    }

    public static void reverseArray(int arr[]) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // Swap elements at start and end indices
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Move towards the middle
            start++;
            end--;
        }
    }

    public static void printArray(int arr[]) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
