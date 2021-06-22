package Odd_even;

public class Odd_even5 {
    int a,b,c;
    public void check_number(int c){
        if (c%2==0){
            System.out.println("find the number even"+c
            );

        }
        else {
            System.out.println("find the value of odd num"+c);
        }
    }
    public static void main(String args[]){
        Odd_even5 Object=new Odd_even5();
        Object.check_number(87);
        Object.check_number(76);
        Object.check_number(9);
    }
}
