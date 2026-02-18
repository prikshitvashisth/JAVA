package array;

public class Max_SumSubArrayBruteForce {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int maxSum = findMaxSubarraySum(arr);
        System.out.println("Maximum sum of a subarray: " + maxSum);
    }

    public static int findMaxSubarraySum(int arr[]) {
        int maxSum = Integer.MIN_VALUE;
        int totalSubarrays = 0;
        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                int sum = 0;
                // Print subarray elements
                for (int k = start; k <= end; k++) {
                    System.out.print(arr[k] + " ");
                    sum += arr[k];
                }
                System.out.print("| Sum: " + sum);
                System.out.println();
                if (sum > maxSum) {
                    maxSum = sum;
                }
                totalSubarrays++;
            }
            System.out.println();
        }
        System.out.println("Total subarrays = " + totalSubarrays);
        return maxSum;
    }
}
