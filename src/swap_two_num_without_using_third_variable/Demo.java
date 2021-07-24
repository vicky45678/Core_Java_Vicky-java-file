package swap_two_num_without_using_third_variable;

public class Demo {
    public static void main(String args[]){
        System.out.println("before swapping");
        int x=10;
        int y=20;
        System.out.println("value of x:"+x);
        System.out.println("value of y:"+y);
        System.out.println("after swapping");
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("value of x:"+x);
        System.out.println("value of y:"+y);
    }

}
