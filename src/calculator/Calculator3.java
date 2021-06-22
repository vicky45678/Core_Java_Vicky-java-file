package calculator;

public class Calculator3 {
    String Name;
    int a;
    int b;
    double c;

    public void a(int a, int b){
        int add=a+b;
        System.out.print("between these num result output in plus--"+add);
    }
    public void b(int b, int c){
        int pecentage=b%c;
        System.out.print("there are number between a percentage value--"+pecentage);
    }
    public void c(int c,int a){
        int divide=c/a;
        System.out.print("there num are between divide--"+divide);
    }
    public static void main(String args[]){
        Calculator3 variable= new Calculator3();
                variable.a(9,8);
                variable.b(8,7);
                variable.c(5,10);
    System.out.print("this is my name is vicky"+ variable.Name);
    }

}
