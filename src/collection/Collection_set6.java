package collection;

import java.util.HashSet;
import java.util.Set;

public class Collection_set6 {
    public void for_set(){

        HashSet<String> set=new HashSet<>();
        //hashset is the function of erase all the duplicate files.
        // print only single Orginal files.
        set.add("value");
        set.add("title");
        set.add("title");
        set.add("task");

        for (Object var:set){
            System.out.println(var);
        }
    }
    public static void main(String args[]){
        Collection_set6 Object=new Collection_set6();
        Object.for_set();
    }

}
