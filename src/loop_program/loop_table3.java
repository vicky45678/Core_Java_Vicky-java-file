package loop_program;

public class loop_table3 {
    int a;
    public void for_table(int a){
        for (int i = 1; i <=10; i++){
            System.out.println(a+"*"+i+"="+(a*i));
        }
    }
    public static void main(String args[]){
        loop_table3 variable= new loop_table3();
        variable.for_table(9);
    }
}
