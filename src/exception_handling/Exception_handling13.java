package exception_handling;

public class Exception_handling13 {
    public int divide(int a, int b) {
        int result = a;

        try {
            result = a / b;
        }
        catch (Exception x) {
            System.out.println(x.toString() + x.getCause() + x.getMessage());
        }

        finally {
            System.out.println("i am finally blocked");
        }
        return result;

    }

    public static void main(String args[]) {
        Exception_handling13 Object = new Exception_handling13();
        System.out.println(Object.divide(9, 0));
    }
}
