import java.util.List;
import java.util.ArrayList;
public class Hashclass {
    public static void main(String[] args) {
//        Map<String, String> arr = new HashMap<>();
//        arr.put("aaa", "bbb");
//        arr.put("aaa", "ddd");
//        arr.put("ccc", "bbb");
//        for (Map.Entry<String, String> entry : arr.entrySet()) {
//            System.out.println(entry.getKey());
//        }

        List<String> arr = new ArrayList<>();
        arr.add("aaa");
        arr.add("bbb");
        arr.add("aaa");
        arr.add("ddd");
        for (String str : arr) {
            System.out.println(str);


        }
    }
}
