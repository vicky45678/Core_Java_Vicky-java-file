package loop_program;

public class Looptable5 {
    int a;
    public void for_table(int a){
        for (int i=1; i<=10; i++){
            System.out.println(a+"*"+i+"="+(a*i));
        }

    }
    public static void main(String args[]){
        Looptable5 variable= new Looptable5();

        variable.for_table(0);
    }
}
