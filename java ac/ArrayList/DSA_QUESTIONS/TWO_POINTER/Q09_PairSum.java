import java.util.*;
public class Q09_PairSum {
    // Brute force O(n^2).
    // If the list is sorted, use Q10's two-pointer O(n) solution.
    public static boolean pairSum(ArrayList<Integer> list, int target) {
        for(int i=0;i<list.size();i++)
            for(int j=i+1;j<list.size();j++)
                if(list.get(i)+list.get(j)==target) return true;
        return false;
    }
    public static void main(String[] args) {
        System.out.println(pairSum(new ArrayList<>(Arrays.asList(2,7,11,15)),9));
    }
}