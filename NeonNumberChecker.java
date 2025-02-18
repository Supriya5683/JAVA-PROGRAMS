import java.util.Scanner;

public class NeonNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isNeon(number)) {
            System.out.println(number + " is a Neon number.");
        } else {
            System.out.println(number + " is not a Neon number.");
        }

        scanner.close();
    }

    public static boolean isNeon(int num) {
        int square = num * num;
        int sumOfDigits = 0;

        // Calculate the sum of digits of the square
        while (square != 0) {
            sumOfDigits += square % 10;
            square /= 10;
        }

        return sumOfDigits == num;
    }
}
