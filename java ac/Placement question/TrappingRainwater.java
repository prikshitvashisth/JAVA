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


/*
========================================
            LOGIC EXPLANATION
========================================

Problem:
--------
Given an array where each element represents the height of a building,
find how much rainwater can be trapped after rainfall.

Example:
Height = [0,1,0,2,1,0,1,3,2,1,2,1]

Water trapped = 6 units

--------------------------------------------------------

Basic Idea:
-----------
A building can trap water only if there is a taller building
on BOTH its left and right sides.

The water above any building is:

Water = min(Max height on Left, Max height on Right)
        - Current Height

Example:

      3
  2   |      2
  |   | 1    |
__|___|_|____|__

If:
Left Maximum = 3
Right Maximum = 2
Current Height = 1

Water = min(3,2) - 1
      = 2 - 1
      = 1 unit

--------------------------------------------------------

Why Two Pointers?

Instead of creating two extra arrays to store left and right
maximum heights, we use two pointers.

left  -> Starts from index 0
right -> Starts from the last index

We also keep:

leftMax  -> Tallest building seen from the left
rightMax -> Tallest building seen from the right

--------------------------------------------------------

Main Observation:
-----------------

If

height[left] < height[right]

then the left side is the limiting side.

This means that even if the right side becomes taller later,
there is already a wall on the right that is higher than
height[left].

Therefore, the amount of water at the left position depends
ONLY on leftMax.

So:

If current building >= leftMax
    Update leftMax
Else
    Water trapped = leftMax - current height

Then move left pointer.

--------------------------------------------------------

Similarly,

If

height[right] <= height[left]

then the right side becomes the limiting side.

The water depends only on rightMax.

If current building >= rightMax
    Update rightMax
Else
    Water trapped = rightMax - current height

Then move right pointer.

--------------------------------------------------------

Why move the smaller side?

Because the smaller side determines the maximum possible water
that can be trapped at that position.

If the left building is shorter,
the right side is already tall enough,
so we can safely calculate water for the left side.

Likewise for the right side.

--------------------------------------------------------

Time Complexity:
----------------
O(n)

Each pointer moves only once through the array.

--------------------------------------------------------

Space Complexity:
-----------------
O(1)

No extra arrays are used.
Only a few variables are maintained.

--------------------------------------------------------

Final Summary:
--------------
1. Start one pointer from each end.
2. Maintain the tallest building seen from both sides.
3. Always process the pointer having the smaller height.
4. Update the maximum height if necessary.
5. Otherwise, add the trapped water.
6. Continue until both pointers meet.

This is the most optimal solution for the Trapping Rain Water problem,
with O(n) time and O(1) extra space.
*/
