package Odd_even;

public class Odd_even2 {
    int a;
    public void check_number(int a) {
        if (a % 2 == 0) {
            System.out.println("find value of even" + a);
        } else {
            System.out.println("find the value odd" + a);
        }
    }
    public static void main(String args[]){
        Odd_even2 Object=new Odd_even2();
        Object.check_number(9);
        Object.check_number(89);
        Object.check_number(56);
        Object.check_number(45);
        Object.check_number(8);
    }
}


