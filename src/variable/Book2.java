package variable;

public class Book2 {

    int Member;
    String name;
    String Army;

    public void managment(int a,int b){
        int add=a+b;
    System.out.print("this is a managment function---"+add);
    }
    public void name(int a,int b){
        int sub=a-b;
     System.out.print("manage all the member by name___"+sub);
    }
    public void title(){
        System.out.print("this is the sing of title");
    }
    public static void main(String args[]){
        Book2 variable=new Book2();
        variable.title();
        variable.name(8,7);
        variable.managment(5,8);

    }

}
