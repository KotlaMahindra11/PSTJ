import java.util.Arrays;

public class Task6 {
    public static void main(String[] args) {

        Integer[] arr = {1, 2, 3, 4};

        Arrays.stream(arr).forEach(i ->
            Arrays.stream(arr)
                  .filter(j -> j > i)
                  .forEach(j -> System.out.println("(" + i + ", " + j + ")"))
        );
    }
}
