package exception_handling;

public class Exception_handling10 {
    public int divide(int a,int b){
        int result=0;

        try{
            result=a/b;
        }
        catch (Exception x){
            System.out.println("exception detail___"+x.toString()+x.getCause()+x.getMessage());
        }
        finally {
            System.out.println("i am finally blocked");
        }
        return result;
    }
    public static void main(String args[]){
        Exception_handling10 Object=new Exception_handling10();
        System.out.println(Object.divide(10,0));
    }
}
