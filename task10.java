import java.util.Scanner;
import java.util.function.BinaryOperator;

public class Task10 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int a = sc.nextInt();

        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();

        BinaryOperator<Integer> sumLastDigit =
                (x, y) -> (x % 10) + (y % 10);

        System.out.println("Sum = " + sumLastDigit.apply(a, b));
    }
}
