package calculator;

public class Calculator {
    public static double add(double x, double y) {
        return x + y;
    }

    public static double subtract(double x, double y) {
        return x - y;
    }

    public static double multiply(double x, double y) {
        return x * y;
    }

    public static double divide(double x, double y) {
        if (y == 0) {
            System.out.println("Cannot divide by 0");
            return 0;
        }
        return x / y;
    }

    public static double power(double x, double y) {
        return Math.pow(x, y);
    }

    public static double root(double x) {
        return Math.sqrt(x);
    }

    public static double log(double x) {
        return Math.log(x);
    }
}
