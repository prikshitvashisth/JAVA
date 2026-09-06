import java.util.*;
public class Q25_LongestConsecutiveSequence {
    public static int longest(ArrayList<Integer> a) {
        HashSet<Integer> set=new HashSet<>(a);
        int best=0;
        for(int x:set) if(!set.contains(x-1)) {
            int y=x,len=1;
            while(set.contains(y+1)){y++;len++;}
            best=Math.max(best,len);
        }
        return best;
    }
    public static void main(String[] args) {
        System.out.println(longest(new ArrayList<>(Arrays.asList(100,4,200,1,3,2))));
    }
}