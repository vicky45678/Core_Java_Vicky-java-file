package collection;

import java.util.HashMap;
import java.util.Map;

public class Collection_map {
    
    public static void main(String args[]) {

        HashMap<String, Integer> map = new HashMap<>();

        map.put("bb", 1);

        map.put("a", 2);

        map.put("ccc", 3);

        System.out.print("Iterating Hashmap");

        for (Map.Entry m : map.entrySet()) {

            System.out.print("value of map---" + m.getValue() + m.getKey());
        }
    }

}