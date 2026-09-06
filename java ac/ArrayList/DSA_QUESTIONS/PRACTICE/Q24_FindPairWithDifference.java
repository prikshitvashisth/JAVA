import java.util.*;
public class Q24_FindPairWithDifference {
    public static boolean hasPair(ArrayList<Integer> a, int diff) {
        HashSet<Integer> set=new HashSet<>();
        for(int x:a) {
            if(set.contains(x-diff) || set.contains(x+diff)) return true;
            set.add(x);
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(hasPair(new ArrayList<>(Arrays.asList(5,20,3,2,50,80)),78));
    }
}