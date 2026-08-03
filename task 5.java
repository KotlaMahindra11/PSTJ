import java.util.Arrays;
import java.util.Scanner;
public class Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of elements: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		System.out.print("Enter the array elements: ");
		for(int i=0; i<=n; i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.print("Enter the value of k: ");
		int k = sc.nextInt();
		
		if(k <=0  ||  k > n ) {
			System.out.println("Invalid k");
		}else {
			int kthsmallest = Arrays.stream(arr)
					                .sorted()
					                .skip(k-1)
					                .findFirst()
					                .orElseThrow();
			System.out.println("The " + k + "th smallest element is: " + kthsmallest );
		}

	}

}
