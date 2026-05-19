//import java.util.ArrayList;
//import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;
public class ListSetMap {
    public static void main(String[] args){
//        add()
//        get()
//        set()
//        size()
//        remove
      //  ArrayList<Integer> arr=new ArrayList<>();
        //HashSet<Integer> arr=new HashSet<>();
        HashMap<Integer,Integer> arr=new HashMap<>();
//        arr.add(1);
//        arr.add(3);
//        arr.add(2);
//        arr.add(1);
        arr.put(1,2);
        arr.put(3,6);
        arr.put(2,6);
        arr.put(1,7);
        //arr.set(4,7);
//        for(int i:arr){
//            System.out.println(i);
       // }

//        arr.remove(4);
       // System.out.println(arr.size());

//for(Map.Entry<Integer,Integer> entry:str.entrySet()){
        //System.out.println(arr.keySet());
        for (Map.Entry<Integer, Integer> entry : arr.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

}
