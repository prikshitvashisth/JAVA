import java.util.*;
public class Q01_FindMaximum {
    // Approach: one pass; keep the largest value seen so far.
    // Time O(n), Space O(1).
    public static int findMax(ArrayList<Integer> list) {
        int max = list.get(0);
        for (int x : list) max = Math.max(max, x);
        return max;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,40,20,50,30));
        System.out.println(findMax(list));
    }
}