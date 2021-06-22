package collection;

import java.util.ArrayList;

public class Collection_arraylist3 {

    public void for_Collection3(){

        ArrayList list=new ArrayList();
        list.add("ravan");
        list.add("raghav");
        list.add("child");
        list.add("vaibhav");

        for (Object var:list){
            System.out.println("print value of element"+var);
        }
    }

    public static void main(String args[]){
        Collection_arraylist3 object=new Collection_arraylist3();
        object.for_Collection3();
    }
}
