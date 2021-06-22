package collection;

import java.util.HashSet;

public class Collection_set {
    public void for_set(){

        HashSet<String> set=new HashSet<>();

        set.add("java");
        set.add("java");
        set.add("core_java");

        for(Object var:set){

            System.out.println(var);
        }
    }
    public static void main(String args []){
        Collection_set Object= new Collection_set();
        Object.for_set();
    }
}
