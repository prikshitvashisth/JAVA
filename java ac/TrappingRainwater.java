public class TrappingRainwater {

    // Function to calculate the total amount of trapped rainwater
    public static int trap(int[] height) {

        // Get the size of the array
        int n = height.length;

        // If the array is empty, no water can be trapped
        if (n == 0) {
            return 0;
        }

        // Two pointers:
        // left starts from the beginning
        // right starts from the end
        int left = 0, right = n - 1;

        // Stores the maximum height seen so far from the left side
        int leftMax = 0;

        // Stores the maximum height seen so far from the right side
        int rightMax = 0;

        // Stores the total trapped water
        int trappedWater = 0;

        // Continue until both pointers meet
        while (left < right) {

            // Compare the heights at both pointers
            if (height[left] < height[right]) {

                // If the current left bar is the tallest so far,
                // update leftMax because it becomes the new boundary.
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    // Otherwise, water can be trapped.
                    // Water trapped = leftMax - current height
                    trappedWater += leftMax - height[left];
                }

                // Move the left pointer one step forward
                left++;

            } else {

                // If the current right bar is the tallest so far,
                // update rightMax.
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    // Otherwise, water can be trapped.
                    // Water trapped = rightMax - current height
                    trappedWater += rightMax - height[right];
                }

                // Move the right pointer one step backward
                right--;
            }
        }

        // Return the total trapped water
        return trappedWater;
    }

    public static void main(String[] args) {

        // Sample input
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};

        // Print the total trapped rainwater
        System.out.println("Trapped rainwater: " + trap(height));
    }
}
