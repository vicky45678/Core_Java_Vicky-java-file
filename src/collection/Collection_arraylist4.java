package collection;

import java.util.ArrayList;

public class Collection_arraylist4 {
    public void for_collection(){
        ArrayList list=new ArrayList();
        list.add("wipro");
        list.add("tcs");
        list.add("tangent");

        for (Object var:list);{
            System.out.println("print the value wipro,tcs,tangent");
        }
    }
    public static void main(String args[]){
        Collection_arraylist4 Object=new Collection_arraylist4();
        Object.for_collection();
    }
}
