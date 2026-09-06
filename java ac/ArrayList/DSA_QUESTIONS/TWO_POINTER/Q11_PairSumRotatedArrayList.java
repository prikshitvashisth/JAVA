import java.util.*;
public class Q11_PairSumRotatedArrayList {
    // Rotated sorted list. Find pivot (largest element), then circular two pointers.
    // Time O(n), Space O(1).
    public static boolean pairSum(ArrayList<Integer> list, int target) {
        int n=list.size(), pivot=-1;
        for(int i=0;i<n-1;i++) if(list.get(i)>list.get(i+1)){ pivot=i; break; }
        if(pivot==-1) pivot=n-1;

        int left=(pivot+1)%n, right=pivot;
        while(left!=right) {
            int sum=list.get(left)+list.get(right);
            if(sum==target)return true;
            if(sum<target) left=(left+1)%n;
            else right=(right-1+n)%n;
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(11,15,6,8,9,10));
        System.out.println(pairSum(list,16)); // 6+10
    }
}