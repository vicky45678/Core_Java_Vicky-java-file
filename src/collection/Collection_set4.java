package collection;

import java.util.HashSet;

public class Collection_set4 {
    public void for_set(){

        HashSet<String> Set= new HashSet<>();

        Set.add("true");
        Set.add("False");
        Set.add("java collection");
        Set.add("true");
        Set.add("false");
        Set.add("every where");

        for (Object roman:Set){
            System.out.println(roman);
            }
        }
        public static void main(String args[]){
        Collection_set4 Object=new Collection_set4();
        Object.for_set();



    }
}
