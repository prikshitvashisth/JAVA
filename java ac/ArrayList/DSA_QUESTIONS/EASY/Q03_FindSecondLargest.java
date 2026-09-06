import java.util.*;
public class Q03_FindSecondLargest {
    // Brute force: sort -> O(n log n).
    // Optimized: one pass with largest and second largest -> O(n), O(1).
    public static int secondLargest(ArrayList<Integer> list) {
        int largest = Integer.MIN_VALUE, second = Integer.MIN_VALUE;
        for (int x : list) {
            if (x > largest) { second = largest; largest = x; }
            else if (x > second && x != largest) second = x;
        }
        return second;
    }
    public static void main(String[] args) {
        System.out.println(secondLargest(new ArrayList<>(Arrays.asList(10,50,20,40,30))));
    }
}