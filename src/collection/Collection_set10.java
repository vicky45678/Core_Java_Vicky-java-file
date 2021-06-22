package collection;

import java.util.HashSet;

public class Collection_set10 {
    public void for_set(){
        HashSet<String> set=new HashSet<>();

        set.add("tired");
        set.add("value pair");
        set.add("integer");
        set.add("integer");

        for (Object var:set){
            System.out.println(var);
        }
    }
    public static void main(String args[]){
        Collection_set10 Object=new Collection_set10();
        Object.for_set();
    }
}
