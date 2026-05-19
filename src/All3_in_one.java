import java.util.*;

public class All3_in_one{
    public static void main(String[] args) {

        // 🔥 LIST (allows duplicates)
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Apple");

        System.out.println("LIST:");
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("----------------");

        // 🔥 SET (no duplicates)
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Apple"); // duplicate ignored

        System.out.println("SET:");
        for (String s : set) {
            System.out.println(s);
        }

        System.out.println("----------------");

        // 🔥 MAP (key-value pairs)
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Apple");
        map.put(2, "Banana");
        map.put(3, "Mango");

        System.out.println("MAP:");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());

        }
    }
}
