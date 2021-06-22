package employee;

import com.sun.org.apache.xpath.internal.operations.Variable;

public class Employee {

    String name;
    String detail;
    String address;
    int salary;
    double ratio;

    public void organisation(){
        System.out.println("this is a organisation a group");
    }
    public void Name(){
        System.out.println("name is the identification");
    }
    public void Address(){
        System.out.println("address is proof of where do you live");
    }
    public void salary(){
        System.out.println("hows pay by company to employee");
    }
    public void ratio(){
        System.out.println("ratio is the compare value between two number");
    }

    public static void main(String args[]) {
        //class name package name= new class name(); this is the method function
        //package name and variable this is the calling function

        Employee variable = new Employee();

       variable.Name();
       variable.Address();
       variable.organisation();
       variable.salary();
       variable.ratio();
    }


}
