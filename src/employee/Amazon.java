package employee;

public class Amazon {


    String name;
    String product;
    String seller;
    String buyer;

    public void name(){
        System.out.println("name of the company product");
    }
    public void product(){
        System.out.println("product manufactured by company");
    }
    public void seller(){
        System.out.println("seller is those function sell a product by employee");
    }
    public void buyer(){
        System.out.println("buyer is those person who puchase a product from the company");
    }
    public static void main(String args[]){

        Amazon variable= new Amazon();
        variable.name();
        variable.product();
        variable.seller();
        variable.buyer();
    }

}
