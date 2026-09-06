import java.util.*;
public class Q12_ContainerWithMostWater {
    // Brute force O(n^2).
    // Optimized two pointers O(n), Space O(1).
    public static int maxWater(ArrayList<Integer> h) {
        int l=0,r=h.size()-1,max=0;
        while(l<r) {
            int height=Math.min(h.get(l),h.get(r));
            max=Math.max(max,height*(r-l));
            if(h.get(l)<h.get(r)) l++; else r--;
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println(maxWater(new ArrayList<>(Arrays.asList(1,8,6,2,5,4,8,3,7))));
    }
}