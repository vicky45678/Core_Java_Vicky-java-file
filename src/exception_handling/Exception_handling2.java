package exception_handling;

public class Exception_handling2 {
    public int divide(int a,int b){
        int result=0;

        try{
            result=a/b;
        }
        catch (Exception x){
            System.out.println("Exception detail__-"+ x.toString() + ".get_Couse___"+ x.getCause()
            + x.getMessage());
        }
        finally {
            System.out.println("i am finally blocked");

        }
        return result;

    }
    public static void main(String args[]){
        Exception_handling2 Object=new Exception_handling2();
        System.out.println(Object.divide(6,0));
    }
}
