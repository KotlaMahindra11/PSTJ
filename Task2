import java.util.Scanner;
import java.util.stream.IntStream;
public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = {10, 20, 30, 40, 50};
		System.out.print("Enter index:");
		int index = sc.nextInt();
		
		IntStream.range(0,  arr.length)
		         .filter(i -> i == index)
		         .map(i -> arr[i])
		         .forEach(System.out::println);
		sc.close();

	}

}
