package loop_program;

public class Loop_table4 {
    int a;
    public void for_table(int a){
        for (int i=1; i<=10; i++){
            System.out.println(a+"*"+i+"="+(a*i));
        }
    }
    public static void main(String args[]){
        Loop_table4 variable= new Loop_table4();
        variable.for_table(11);
    }
}
