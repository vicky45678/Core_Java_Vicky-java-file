package loop_program;

public class Looptable2 {
    int a;

    public void for_table(int a) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(a + "*" + i + "=" + (a * i));
        }
    }

    public static void main(String args[]) {
        Looptable2 variable = new Looptable2();
        variable.for_table(6);
    }
}