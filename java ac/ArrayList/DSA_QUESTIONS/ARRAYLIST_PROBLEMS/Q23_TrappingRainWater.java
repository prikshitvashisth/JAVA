import java.util.*;
public class Q23_TrappingRainWater {
    // Two pointers with leftMax/rightMax. O(n) time, O(1) space.
    public static int trap(ArrayList<Integer> h) {
        int l=0,r=h.size()-1,leftMax=0,rightMax=0,water=0;
        while(l<r) {
            if(h.get(l)<=h.get(r)) {
                leftMax=Math.max(leftMax,h.get(l));
                water+=leftMax-h.get(l);
                l++;
            } else {
                rightMax=Math.max(rightMax,h.get(r));
                water+=rightMax-h.get(r);
                r--;
            }
        }
        return water;
    }
    public static void main(String[] args) {
        System.out.println(trap(new ArrayList<>(Arrays.asList(0,1,0,2,1,0,1,3,2,1,2,1))));
    }
}