import java.util.*;

public class ArrayList12_IterateUsingListIterator {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(10, 20, 30));

        ListIterator<Integer> it = list.listIterator();

        System.out.println("Forward:");
        while (it.hasNext()) System.out.println(it.next());

        System.out.println("Backward:");
        while (it.hasPrevious()) System.out.println(it.previous());

        // ListIterator supports next(), previous(), add(), set(), remove().
    }
}
