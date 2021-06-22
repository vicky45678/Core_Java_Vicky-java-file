package Odd_even;

public class Odd_even4 {
    int a,b;
    public void check_number(int b){
        if (b%2==0){
        System.out.println("find the even num"+b);
    }
        else {
            System.out.println("find the even num"+b);
        }
}
    public static void main(String args[]){
    Odd_even4 Object=new Odd_even4();
    Object.check_number(12);
    Object.check_number(98);
    Object.check_number(45);

    }
}
