import java.util.Scanner;
import java.util.stream.Stream;

public class Task8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int fib = Stream.iterate(new int[]{0,1},
                a -> new int[]{a[1], a[0]+a[1]})
                .limit(n)
                .reduce((a,b)->b)
                .get()[0];

        System.out.println("Fibonacci = " + fib);
    }
}
