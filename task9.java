import java.util.Scanner;

interface PerformOoperation{
    boolean check(int a);
}

public class Task9 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        PerformOoperation palindrome = num -> {
            int temp = num;
            int rev = 0;

            while(temp > 0){
                rev = rev * 10 + temp % 10;
                temp /= 10;
            }

            return rev == num;
        };

        System.out.println(palindrome.check(n) ? "Palindrome" : "Not Palindrome");
    }
}
