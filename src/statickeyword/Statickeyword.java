package statickeyword;

public class Statickeyword {

    int count=5;   // not static
    static int value=5;  // static data

    public static void display(int a){
        System.out.println("this a value--"+a);

    }
    public static void main(String args[]){

        Statickeyword.display(9);
        System.out.println(Statickeyword.value);

    }

}
