import java.util.*;

public class ArrayList00_ArrayList_CheatSheet {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // CREATE
        // ArrayList<Integer> list = new ArrayList<>();

        // ADD
        list.add(10);              // add at end
        list.add(20);
        list.add(1, 15);           // add at index

        // ACCESS / UPDATE
        System.out.println(list.get(1));  // get
        list.set(1, 99);                   // replace

        // SEARCH
        System.out.println(list.contains(99));
        System.out.println(list.indexOf(99));
        System.out.println(list.lastIndexOf(99));

        // REMOVE
        list.remove(0);                       // remove by index
        list.remove(Integer.valueOf(20));     // remove by value

        // SIZE / EMPTY
        System.out.println(list.size());
        System.out.println(list.isEmpty());

        // ADD / REMOVE COLLECTIONS
        ArrayList<Integer> other = new ArrayList<>(Arrays.asList(30, 40));
        list.addAll(other);
        list.removeAll(other);

        // SORT / REVERSE / SWAP
        Collections.sort(list);
        Collections.reverse(list);
        if (list.size() >= 2) Collections.swap(list, 0, 1);

        // MAX / MIN
        if (!list.isEmpty()) {
            System.out.println(Collections.max(list));
            System.out.println(Collections.min(list));
        }

        // TRAVERSAL
        for (int i = 0; i < list.size(); i++) System.out.println(list.get(i));
        for (int x : list) System.out.println(x);

        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) System.out.println(it.next());

        // CLEAR
        list.clear();

        /*
        IMPORTANT:
        ArrayList uses wrapper classes: Integer, Double, Character, Boolean.
        list.remove(2) removes INDEX 2.
        list.remove(Integer.valueOf(2)) removes VALUE 2.
        */
    }
}
