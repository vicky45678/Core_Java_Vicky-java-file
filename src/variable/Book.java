package variable;

public class Book {

    int page;
    String name;
    String book_title;

    public void read(){

        System.out.print("this is read function");
    }
    public void write(){

        System.out.print("this is write function");

    }
    public void page_number(){

        System.out.print("this is page_number");
    }

    public static void main(String args[]){

        //class name package name=new class name ();--->method function
        //package name.function name ();----->calling function

        Book variable=new Book();

        variable.page_number();
        variable.read();
        variable.write();
    }

}
