package variable;

public class Book6 {
    int a;
    int b;
    String name;
    String post;

    public void book(int a, int b){
        int add=a+b;
        System.out.println("this is the function counting of book");
    }
    public void pages(int a, int b){
        int add=a+b;
        System.out.println("this is the function of counting of book pages");
    }
    public void title(){
        String name;
        System.out.println("this is the title of the title");
    }
    public void post(){
        String post;
        System.out.println("this is the function about of the book post");
    }

    public static void main(String args[]){
        Book6 variable=new Book6();
        variable.book(1,6);
        variable.pages(56,110);
        variable.title();
        variable.post();
    }
}
