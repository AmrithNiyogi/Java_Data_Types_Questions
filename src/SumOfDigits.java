import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = sc.nextInt();
        int sum = 0;

        while (number != 0) {
            number = number % 10;
            sum = sum + number;
            number = number/10;
        }
    }
}
