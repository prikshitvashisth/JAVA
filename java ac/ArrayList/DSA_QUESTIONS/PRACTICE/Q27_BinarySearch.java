import java.util.*;
public class Q27_BinarySearch {
    public static int search(ArrayList<Integer> a,int target) {
        int l=0,r=a.size()-1;
        while(l<=r) {
            int m=l+(r-l)/2;
            if(a.get(m)==target)return m;
            if(a.get(m)<target)l=m+1;else r=m-1;
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println(search(new ArrayList<>(Arrays.asList(1,3,5,7,9)),7));
    }
}