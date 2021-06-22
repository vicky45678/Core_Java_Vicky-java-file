package exception_handling;

public class Exception_handling9 {
    public int divide(int a, int b){
        int resutl=0;

        try {
            resutl=a/b;
        }
        catch (Exception x){
            System.out.println(x.toString()+x.getCause()+x.getMessage());
        }
        finally {
            System.out.println("i am finally blocked");
        }
        return resutl;
    }
    public static void main(String args[]){
    Exception_handling9 Object=new Exception_handling9();
        System.out.println(Object.divide(9,0));
    }
}
