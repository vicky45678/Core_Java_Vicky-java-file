package exception_handling;

public class Exception_handling6 {

    public int divide(int a, int b) {
        int result = 0;

        try {
            result = a / b;
        } catch (Exception x) {
            System.out.println("Exception detail___" + x.toString() + "get couse___" + x.getCause()
                    + x.getMessage());
        } finally {
            System.out.println(" iam finally blocked");
        }
        return result;
    }

    public static void main(String args[]) {
        Exception_handling6 Object = new Exception_handling6();
        System.out.println(Object.divide(4, 0));
    }
}