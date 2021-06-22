package collection;

import java.util.HashSet;

public class Collection_set8 {
    public void for_set(){
        HashSet<String>set=new HashSet<>();
        set.add("core java");
        set.add("core java");
        set.add("java");
        set.add("spring");
        set.add("spring boot");
        set.add("spring");


        for (Object var:set){
            System.out.println(var);
        }
    }
    public static void main(String args[]){
        Collection_set8 Object=new Collection_set8();
        Object.for_set();
    }
}
