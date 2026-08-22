import java.util.*;

public class Task5BankingTransactionSystem {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		sc.nextLine();
		
		List<String> operations = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			operations.add(sc.nextLine());
			
		}
		int balance = operations.stream()
				.mapToInt(operation -> {
					String[] parts = operation.split(" ");
					int amount = Integer.parseInt(parts[1]);
					
					return parts[0].equals("Deposit") ? amount : -amount;
					
				})
				.sum();
		System.out.println(balance);
		
		sc.close();
 		
	}

}
