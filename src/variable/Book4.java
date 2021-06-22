package variable;

import com.sun.deploy.security.BadCertificateDialog;

public class Book4 {

    String behaviour;
    String name;
    int num;
    float number;

    public void Behaviour(){

        System.out.println("this is function human nature behaviour");
    }
    public void name(){

        System.out.println("title of the name");
    }
    public void num(){

        System.out.println("number of the value");
    }
    public void number(){

        System.out.println("the function is the ratio between number___");
    }

    public static void main(String args []){
        Book4 variable=new Book4();
        variable.Behaviour();
        variable.name();
        variable.num();
        variable.number();

    }
}
