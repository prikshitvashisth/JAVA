import java.util.*;
public class ArrayList27_ReverseArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10,20,30,40));
        Collections.reverse(list);
        System.out.println(list);
    }
}