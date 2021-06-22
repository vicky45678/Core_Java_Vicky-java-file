package collection;

import java.util.HashSet;

public class Collection_set7 {
    public void for_set(){
        HashSet<Integer>set=new HashSet<>();

        set.add(9);
        set.add(98);
        set.add(9);
        set.add(88);
        set.add(0);

        for (Object var:set){
            System.out.println(var);
        }
    }
    public static void main(String args[]){
        Collection_set7 Object=new Collection_set7();
        Object.for_set();
    }
}
