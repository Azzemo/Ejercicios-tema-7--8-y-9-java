public class Funciondividie {

    public static double divideByZero() throws ArithmeticException {
        try {
            double a = 1;
            double b = 0;
            return a/b;
        } catch (ArithmeticException e) {
            System.out.println("Excepción ArithmeticException: Esto no puede hacerse");
            throw e;
        } finally {
            System.out.println("Demo de código");
        }
    }
    
    public static void main(String[] args) {
        try {
            divideByZero();
        } catch (ArithmeticException e) {
            System.out.println("Excepción ArithmeticException: "+ e.getMessage());
        }
    }
}
    