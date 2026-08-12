import java.util.*;
import java.util.stream.*;

public class Task4IntelligentDNAPatternSearch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();
        String pattern = sc.nextLine();

        int[] lps = buildLPS(pattern);

        List<Integer> result = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < text.length()) {

            if (text.charAt(i) == pattern.charAt(j)) {
                i++;
                j++;

                if (j == pattern.length()) {
                    result.add(i - j);
                    j = lps[j - 1];
                }

            } else if (j > 0) {
                j = lps[j - 1];
            } else {
                i++;
            }
        }

        result.stream()
              .forEach(index -> System.out.print(index + " "));

        sc.close();
    }

    static int[] buildLPS(String pattern) {

        int[] lps = new int[pattern.length()];

        int len = 0;

        IntStream.range(1, pattern.length()).forEach(i -> {
        	
        });

        int i = 1;

        while (i < pattern.length()) {

            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } 
            else if (len > 0) {
                len = lps[len - 1];
            } 
            else {
                lps[i] = 0;
                i++;
            }
        }

        return lps;
    }
}