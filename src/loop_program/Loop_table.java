package loop_program;

public class Loop_table {

   int a;

    public void for_table(int a){

        for(int i=1;i<=10;i++) {

            System.out.print(a + "*" + i + "=" + (a * i));
        }
    }
    public static void main(String args[]){

        Loop_table variable=new Loop_table();

        variable.for_table(2);


    }
}
