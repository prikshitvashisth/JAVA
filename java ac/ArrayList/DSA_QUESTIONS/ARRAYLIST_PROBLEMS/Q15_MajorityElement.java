import java.util.*;
public class Q15_MajorityElement {
    // Brute force/count map: O(n) extra space.
    // Boyer-Moore voting: O(n) time, O(1) space; verify candidate.
    public static int majority(ArrayList<Integer> a) {
        int candidate=0,count=0;
        for(int x:a) {
            if(count==0) candidate=x;
            count += (x==candidate)?1:-1;
        }
        int freq=0; for(int x:a) if(x==candidate)freq++;
        return freq>a.size()/2 ? candidate : -1;
    }
    public static void main(String[] args) {
        System.out.println(majority(new ArrayList<>(Arrays.asList(2,2,1,1,1,2,2))));
    }
}