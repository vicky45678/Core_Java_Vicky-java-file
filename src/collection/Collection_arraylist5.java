package collection;

import java.util.ArrayList;
import java.util.Collection;

public class Collection_arraylist5 {
    public void for_Collection(){
        ArrayList list=new ArrayList();
        list.add("vaibhav");
        list.add("manipulate");
        list.add("king");
        list.add("naman");

        for (Object var:list){
            System.out.println(var);
        }
    }
    public static void main(String args[]){
        Collection_arraylist5 Object=new Collection_arraylist5();
        Object.for_Collection();
    }
}
