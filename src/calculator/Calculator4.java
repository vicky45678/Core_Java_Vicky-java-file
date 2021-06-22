package calculator;

public class Calculator4 {
    int a;
    int b;
    int c;

    public void a(int a,int b){
        int add=a+b;
        System.out.print(" a is the of value b plus--"+add);
    }
    public void b(int b, int c){
        int subtract=b-c;
        System.out.print(" b is minuse num of value c--"+subtract);
    }
    public void c(int c, int a){
        int multiply=c*a;
        System.out.print("c is mutliply by a--"+multiply);
    }
    public static void main(String args[]){
        Calculator variable= new Calculator();
        variable.a(8,9);
         variable.b(4,6);
         variable.c(5,8);
    }
}
