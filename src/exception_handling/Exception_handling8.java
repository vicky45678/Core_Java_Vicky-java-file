package exception_handling;

public class Exception_handling8 {
    public int divide(int a, int b){
        int result=0;

        try {
            result=a/b;
        }
        catch (Exception x){
            System.out.println("Exception detail___"+x.toString()+"get couse___"+x.getCause()+x.getMessage());
        }
        finally {
            System.out.println("i am finally blocked");
        }
        return result;
    }
    public static void main(String args[]){
        Exception_handling8 Object=new Exception_handling8();
        System.out.println(Object.divide(8,0));
    }
}
