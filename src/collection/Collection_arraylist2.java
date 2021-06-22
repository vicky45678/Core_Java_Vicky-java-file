package collection;

import java.util.ArrayList;

public class Collection_arraylist2 {
    public void for_Collection() {
        ArrayList list = new ArrayList();
        list.add("vicky");
        list.add("vicky");
        list.add("manav");
        list.add("rishab");
        for (Object var:list){
            System.out.print("value of this element" + var);
        }
    }

    public static void main(String args[]) {
        Collection_arraylist2 object=new Collection_arraylist2();
        object.for_Collection();

    }
}