import java.util.*;
public class Q04_ReverseArrayList {
    // Two pointers: swap left/right. Time O(n), Space O(1).
    public static void reverse(ArrayList<Integer> list) {
        int i=0, j=list.size()-1;
        while (i<j) {
            Collections.swap(list,i,j);
            i++; j--;
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        reverse(list); System.out.println(list);
    }
}