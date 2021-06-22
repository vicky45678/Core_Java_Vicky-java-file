package calculator;

public class Calculator {
    int a;
    int b;
    int c;
    int d;

    public void a(int a, int b){
        int add=a+b;
        System.out.print("this is add function--"+add);
    }
    public void b(int c, int d){
        int subtract=c-d;
        System.out.print("this is the minus value--"+subtract);
    }
    public void c(int a, int d){
        int multiply=a*d;
        System.out.print("thid is a multiplication--"+multiply);
    }
    public static void main(String args[]){
        Calculator variable= new Calculator();
        variable.a(9,8);
        variable.b(10,6);
        variable.c(78,87);

    }
}
