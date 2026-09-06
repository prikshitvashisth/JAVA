import java.util.*;
public class ArrayList38_ArrayListOfStrings {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Aman","Riya","Rahul"));
        names.add("Neha");
        Collections.sort(names);
        System.out.println(names);
    }
}