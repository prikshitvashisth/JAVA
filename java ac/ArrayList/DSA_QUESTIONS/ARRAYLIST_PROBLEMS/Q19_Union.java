import java.util.*;
public class Q19_Union {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>(Arrays.asList(1,2,3,4));
        ArrayList<Integer> b=new ArrayList<>(Arrays.asList(3,4,5,6));
        ArrayList<Integer> union=new ArrayList<>(a);
        for(int x:b) if(!union.contains(x)) union.add(x);
        System.out.println(union);
        // Simple version: O((n+m)*(n+m)) worst case because contains() is linear.
    }
}