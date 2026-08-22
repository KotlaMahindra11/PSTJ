import java.util.*;
import java.util.function.BiFunction;

public class TASK9CalculatorUnitTesting {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        String operator = sc.next();
        double b = sc.nextDouble();

        // Functional calculator operations
        Map<String, BiFunction<Double, Double, Double>> operations = new HashMap<>();

        operations.put("+", (x, y) -> x + y);
        operations.put("/", (x, y) -> {
            if (y == 0)
                throw new ArithmeticException("Division by zero");
            return x / y;
        });

        try {
            double result = operations.get(operator).apply(a, b);

            // Unit test: verify the operation produces a valid result
            boolean testPassed;

            if (operator.equals("+")) {
                testPassed = result == a + b;
            } else {
                testPassed = result == a / b;
            }

            System.out.println(testPassed ? "Test Passed" : "Test Failed");

        } catch (ArithmeticException e) {
            System.out.println("Test Failed");
        }

        sc.close();
    }
}