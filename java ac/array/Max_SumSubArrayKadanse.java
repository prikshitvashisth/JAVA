public class Max_SumSubArrayKadanse {
    public static void kadanes(int numbers[]) {
        int ms = Integer.MIN_VALUE;
        int cs = 0;

        for (int i = 0; i < numbers.length; i++) {
            cs = cs + numbers[i];
            if (cs < 0) {
                cs = 0;
            }
            ms = Math.max(cs, ms);
        }
        System.out.println("our max subarray sum is : " + ms);
    }

    public static void main(String[] args) {
        int[] numbers = {1, -2, 6, -1, 3};
        kadanes(numbers);
    }
}

/*
Explanation of Kadane's Algorithm:
----------------------------------
Kadane's algorithm is an efficient way to find the maximum sum of a contiguous subarray within a one-dimensional array of numbers.

How it works:
1. We maintain two variables:
   - cs (current sum): The sum of the current subarray being considered.
   - ms (maximum sum): The maximum subarray sum found so far.
2. We iterate through the array, adding each element to cs.
3. If cs becomes negative, we reset it to 0, because a negative sum will not help in finding the maximum sum for future subarrays.
4. At each step, we update ms to be the maximum of ms and cs.
5. At the end, ms contains the maximum subarray sum.

Time Complexity: O(n)
Space Complexity: O(1)

Example:
For the array [1, -2, 6, -1, 3], the maximum subarray sum is 8 (from subarray [6, -1, 3]).
*/
