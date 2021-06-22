package collection;

import java.util.HashSet;
import java.util.Set;

public class Collection_set3 {
    public void For_Set(){

    HashSet<String> Set=new HashSet<>();

    Set.add("even number");
    Set.add("variable");
    Set.add("collection");
    Set.add("even number");
    Set.add("odd num");

    for (Object var:Set){
        System.out.println(var);
    }

    }
    public static void main(String args[]){
        Collection_set3 Object=new Collection_set3();
        Object.For_Set();
    }
}
