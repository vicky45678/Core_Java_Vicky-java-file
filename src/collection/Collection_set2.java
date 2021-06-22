package collection;

import java.util.HashSet;

public class Collection_set2 {

    public void for_set(){

        HashSet<Integer> Set=new HashSet<>();

        Set.add(1);
        Set.add(2);
        Set.add(1);
        Set.add(2);
        Set.add(3);
        Set.add(4);
        for (Object abcdef:Set){
            System.out.println(abcdef);

        }
    }
    public static void main(String  args[]){
            Collection_set2 Object=new Collection_set2();
            Object.for_set();
    }
}
