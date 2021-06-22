package Odd_even;

public class odd_even3 {
    int a;
    public void check_number(int a){
        if (a%2==0){
            System.out.println("find the odd num"+a);
        }
        else {
            System.out.println("find the num of even"+a);
        }

    }
    public static void main(String args[]){
        odd_even3 Object=new odd_even3();
        Object.check_number(56);
        Object.check_number(23);
        Object.check_number(43);
        Object.check_number(90);
    }
}
