package calculator;

public class calulator2 {
    int vaibhav;
    int renu;
    int akash;

    public void vaibhav(int avaibhav, int renu){
        int add=vaibhav+renu;
        System.out.print("vaibhav and renu between add num--"+add);
    }
    public void renu(int renu, int akash){
        int subtract=renu-akash;
        System.out.print("renu and akash relation between subtract num--"+subtract);
    }
    public void akash(int vaishav, int akash){
        int multiply=vaishav*akash;
        System.out.print("there are relation between multiplication--"+multiply);
    }
    public static void main(String args[]){
        calulator2 variable=new calulator2();
                variable.vaibhav(8,9);
                variable.renu(78, 65);
                variable.akash(3,4);

    }
}
