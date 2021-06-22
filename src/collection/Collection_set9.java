package collection;

import java.util.HashSet;

public class Collection_set9 {
    public void for_set(){
        HashSet<String>set=new HashSet<>();
        set.add("tiger");
        set.add("vapoun");
        set.add("trigger");
        set.add("tiger");

        for (Object var:set){
            System.out.println(var);

        }
    }
    public static void main(String args[]){
        Collection_set9 Object=new Collection_set9();
        Object.for_set();
    }
}
