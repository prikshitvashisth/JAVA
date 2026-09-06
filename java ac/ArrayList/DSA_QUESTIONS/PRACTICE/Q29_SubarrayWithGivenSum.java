import java.util.*;
public class Q29_SubarrayWithGivenSum {
    // Sliding window works for non-negative values. O(n).
    public static boolean exists(ArrayList<Integer> a,int target) {
        int l=0,sum=0;
        for(int r=0;r<a.size();r++) {
            sum+=a.get(r);
            while(sum>target && l<=r) sum-=a.get(l++);
            if(sum==target)return true;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(exists(new ArrayList<>(Arrays.asList(1,4,20,3,10,5)),33));
    }
}