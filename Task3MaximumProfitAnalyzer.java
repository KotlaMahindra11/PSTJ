import java.util.*;
import java.util.stream.*;

public class Task3MaximumProfitAnalyzer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] profits = new int[n];

        for (int i = 0; i < n; i++) {
            profits[i] = sc.nextInt();
        }

        int[] result = {0, Integer.MIN_VALUE};

        IntStream.of(profits).forEach(value -> {
            result[0] = Math.max(0, result[0] + value);
            result[1] = Math.max(result[1], result[0]);
        });

        System.out.println(result[1]);
    }
}