package variable;

public class Book3 {

    String name;
    int publish;
    String title;

    public void name(){
        System.out.println("this is the function mention the name of employee");
    }
    public void publish() {
        System.out.println("this the program of promotion");
    }
    public void title() {
        System.out.println("name of the title");
    }
    public static void main(String args[]){
        Book3 variable=new Book3();
        variable.name();
        variable.publish();
        variable.title();
    }
}
