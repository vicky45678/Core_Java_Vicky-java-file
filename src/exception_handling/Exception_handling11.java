package  exception_handling;

public class Exception_handling11 {
    public int divide(int a, int b){
        int result =0;

        try {
            result=a/b;
        }
        catch (Exception x){
            System.out.println("Exception detail"+x.toString()+x.getCause()+x.getMessage());
        }
        finally {
            System.out.println("i am finally block");
        }
        return result;
    }
    public static void main(String args[]){
     Exception_handling11 Object=new Exception_handling11();
        System.out.println(Object.divide(7,0));
    }
}
