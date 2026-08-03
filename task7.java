import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        System.out.print("Enter E for Even or O for Odd: ");
        char ch = sc.next().charAt(0);

        int sum = String.valueOf(num)
                .chars()
                .map(c -> c - '0')
                .filter(d -> (ch == 'E' || ch == 'e') ? d % 2 == 0 : d % 2 != 0)
                .sum();

        System.out.println("Sum = " + sum);
    }
}
