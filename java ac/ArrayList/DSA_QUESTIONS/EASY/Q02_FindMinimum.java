import java.util.*;
public class Q02_FindMinimum {
    // Time O(n), Space O(1).
    public static int findMin(ArrayList<Integer> list) {
        int min = list.get(0);
        for (int x : list) min = Math.min(min, x);
        return min;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,40,20,50,30));
        System.out.println(findMin(list));
    }
}