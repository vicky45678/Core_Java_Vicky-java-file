package Odd_even;

public class Odd_even {
    int a;

    public void check_number(int a){
        if (a%2==0){
            System.out.println("find the even number"+a);
        }
        else {
            System.out.println("find the odd number"+a);
        }
    }
    public static void main(String args[]){
        Odd_even Object=new Odd_even();
        Object.check_number(1);
        Object.check_number(2);
        Object.check_number(3);
        Object.check_number(4);
        Object.check_number(5);
        Object.check_number(6);
        Object.check_number(7);
        Object.check_number(8);
        Object.check_number(9);
        Object.check_number(0);

    }



}
