package array;

public class SubarraySum {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        printAllSubarraySums(arr);
    }

    public static void printAllSubarraySums(int arr[]) {
        for (int start = 0; start < arr.length; start++) {
            int currentSum = 0;
            for (int end = start; end < arr.length; end++) {
                currentSum += arr[end];
                System.out.println("Sum of subarray from index " + start + " to " + end + " is: " + currentSum);
            }
        }
    }
}
