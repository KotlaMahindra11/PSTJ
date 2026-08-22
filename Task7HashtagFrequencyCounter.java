import java.util.*;
import java.util.function.BiConsumer;

public class Task7HashtagFrequencyCounter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        Map<String, Integer> frequency = new LinkedHashMap<>();

        // Functional approach to count frequencies
        for (int i = 0; i < n; i++) {
            String hashtag = sc.next();
            frequency.merge(hashtag, 1, Integer::sum);
        }

        // Functional approach to display results
        BiConsumer<String, Integer> printer =
                (hashtag, count) -> System.out.println(hashtag + " " + count);

        frequency.forEach(printer);

        sc.close();
    }
}