package collection;

import java.util.HashSet;
import java.util.Set;

public class Collection_set5 {
    public void for_set(){
        HashSet<String> Set=new HashSet<>();

        Set.add("Raghvendra");
        Set.add("shaifali");
        Set.add("shaifali");
        Set.add("vipul");

        for (Object name:Set){
            System.out.println(name);
        }

        }
        public static void main(String args[]){
        Collection_set5 Object=new Collection_set5();
        Object.for_set();
        }
    }

