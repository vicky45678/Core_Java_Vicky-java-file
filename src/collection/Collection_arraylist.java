package collection;

import java.util.ArrayList;

public class Collection_arraylist {
    public void for_colletion(){
        ArrayList list=new ArrayList();
        list.add("aryan");
        list.add("shivam");
        list.add("aryan singh");
        for(Object var:list){
            System.out.print("value of this element"+var);
        }


    }
    public static void main(String args[]){
        Collection_arraylist object=new Collection_arraylist();
        object.for_colletion();
    }


}
