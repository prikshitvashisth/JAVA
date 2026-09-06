import java.util.ArrayList;

public class ArrayList01_CreateArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();
        ArrayList<Double> prices = new ArrayList<>();
        ArrayList<Character> chars = new ArrayList<>();

        nums.add(10);
        names.add("Aman");
        prices.add(99.5);
        chars.add('A');

        System.out.println(nums);
        System.out.println(names);
        System.out.println(prices);
        System.out.println(chars);

        // ArrayList<int> is invalid. Use ArrayList<Integer>.
    }
}
