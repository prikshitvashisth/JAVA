import java.util.*;
public class Q30_FrequencyUsingHashMap {
    public static void main(String[] args) {
        ArrayList<Integer> a=new ArrayList<>(Arrays.asList(1,2,2,3,1,2));
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int x:a) freq.put(x,freq.getOrDefault(x,0)+1);
        System.out.println(freq);
    }
}