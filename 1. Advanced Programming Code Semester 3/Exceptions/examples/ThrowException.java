package examples;

public class ThrowException {

    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;

        try {
            System.out.println(ThrowException.division(numerator, denominator)); //this calls on the method below called division
        } catch (NullPointerException e) {
            System.out.println("Error message: " + e.getMessage());
        }
    }
// the int a and b does mean the numerator and the denominator above
    private static float division(int a, int b) throws NullPointerException { //this is sent by the line 20
        float c; //this has the content, vid 5, 13 min
        try {
            c = a / b;
        } catch(ArithmeticException e) { //this is tranforming one exception into another, catch this and throw the one below, goes to line 16
            throw new NullPointerException();
        } 
        return c;
    }
}
