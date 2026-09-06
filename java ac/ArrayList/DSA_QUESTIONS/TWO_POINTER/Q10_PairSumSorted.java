import java.util.*;
public class Q10_PairSumSorted {
    // Sorted list: two pointers. Time O(n), Space O(1).
    public static boolean pairSum(ArrayList<Integer> list, int target) {
        int i=0,j=list.size()-1;
        while(i<j) {
            int sum=list.get(i)+list.get(j);
            if(sum==target)return true;
            if(sum<target)i++; else j--;
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(pairSum(new ArrayList<>(Arrays.asList(1,2,4,6,8,9,14)),10));
    }
}