import java.util.*;
public class Q20_MissingNumber {
    // Numbers are 0..n with one missing. XOR avoids overflow.
    // Time O(n), Space O(1).
    public static int missing(ArrayList<Integer> a) {
        int n=a.size(), xor=n;
        for(int i=0;i<n;i++) xor ^= i ^ a.get(i);
        return xor;
    }
    public static void main(String[] args) {
        System.out.println(missing(new ArrayList<>(Arrays.asList(3,0,1))));
    }
}