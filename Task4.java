import java.util.Arrays;
import java.util.Scanner;
public class Task4 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        
        int max = Arrays.stream(arr).max().getAsInt();
        
        int min = Arrays.stream(arr).min().getAsInt();

        
        System.out.println("Maximum element = " + max);
        
        
        System.out.println("Minimum element = " + min);

        sc.close();
    }

}
