package collection;

import java.util.ArrayList;

public class Collection_arraylist6 {
    public void for_Collection(){

        ArrayList list=new ArrayList();
        list.add("Vikrant");
        list.add("value");
        list.add("common man");

        for (Object var:list){
            System.out.println("print the value of element___"+var);

        }
    }
    public static void main(String args[]){
        Collection_arraylist6 Object=new Collection_arraylist6();
        Object.for_Collection();
    }

}
