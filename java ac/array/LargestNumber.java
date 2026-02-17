package array;

public class LargestNumber {
    public static void main(String[] args) {
        int arr[] = {10, 25, 30, 45, 50, 60};
        int largest = findLargest(arr);
        System.out.println("Largest number in the array: " + largest);
    }

    public static int findLargest(int arr[]) {
        int largest = arr[0]; // Assume the first element is the largest

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i]; // Update largest if current element is greater
            }
        }
        return largest;
    }
}
