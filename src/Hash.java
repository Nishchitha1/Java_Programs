import java.lang.reflect.Array;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;

public class Hash {
    public static void main(String[] args) {
        Map<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("England", "London");
        capitalCities.put("India", "New Dehli");
        capitalCities.put("Austria", "Wien");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("Norway", "Oslogttt"); // Duplicate
        capitalCities.put("USA", "Washington DC");

        System.out.println(capitalCities.get("Norway"));
//System.out.println(capitalCities.keySet());
        //System.out.println(capitalCities.get("Noway":"Oslo"));
//        for(int i=0;i<capitalCities.keySet;i++){

        }
    }

//        int[] arr = new int[5];
//        for (int i = 0; i == arr.length; i++)
//            System.out.println("hash");
////            int a =10;
////            int b=20;
////            if(a==b)
//        Array1 ar= new Array1();
//    }
//}
//class Array1{
//
//    ArrayList<String> arr=new ArrayList<>();
//    arr.add("aaa");
//    arr.add("bbb");
//
//
//
//
