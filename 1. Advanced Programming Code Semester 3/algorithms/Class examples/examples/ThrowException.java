package examples;

public class ThrowException {

    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;

        try {
            System.out.println(ThrowException.division(numerator, denominator));
        } catch (NullPointerException e) {
            System.out.println("Error message: " + e.getMessage());
        }
    }

    private static float division(int a, int b) throws NullPointerException {
        float c;
        try {
            c = a / b;
        } catch(ArithmeticException e) {
            throw new NullPointerException();
        } 
        return c;
    }
}
