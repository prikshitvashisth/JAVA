import java.util.*;
public class Q22_MaximumSubarraySum {
    // Kadane's algorithm: O(n) time, O(1) space.
    public static int maxSubarray(ArrayList<Integer> a) {
        int current=a.get(0), best=a.get(0);
        for(int i=1;i<a.size();i++) {
            current=Math.max(a.get(i),current+a.get(i));
            best=Math.max(best,current);
        }
        return best;
    }
    public static void main(String[] args) {
        System.out.println(maxSubarray(new ArrayList<>(Arrays.asList(-2,1,-3,4,-1,2,1,-5,4))));
    }
}