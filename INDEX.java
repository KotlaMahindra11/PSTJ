import java.util.stream.IntStream;

public class INDEX {

	public static void main(String[] args) {
		int[] arr = {10,20,30,40,50};
		int index = 2;
		
		IntStream.range(0, arr.length)
				 .filter(i -> i == index)
				 .map(i -> arr[i])
				 .forEach(System.out::println);
		

	}

}
