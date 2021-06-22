package Odd_even;

public class Odd_even6 {
    int a;
    public void check_number(int a){
        if (a%2==0){
            System.out.println("find the value number of even"+a);
        }
        else {
            System.out.println("find the num value"+a);
        }
    }
    public static void main(String args[]){
        Odd_even6 Object=new Odd_even6();
        Object.check_number(9);
        Object.check_number(12);
        Object.check_number(32);
        Object.check_number(54);
    }
}
