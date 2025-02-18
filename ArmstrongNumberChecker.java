import java.util.Scanner;

public class ArmstrongNumberChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the lower bound: ");
        int lower = scanner.nextInt();

        System.out.print("Enter the upper bound: ");
        int upper = scanner.nextInt();

        System.out.println("Armstrong numbers between " + lower + " and " + upper + " are:");

        for (int num = lower; num <= upper; num++) {
            if (isArmstrong(num)) {
                System.out.print(num + " ");
            }
        }

        scanner.close();
    }

    public static boolean isArmstrong(int num) {
        int sum = 0, temp = num, digits = 0;

        // Count the number of digits
        while (temp != 0) {
            digits++;
            temp /= 10;
        }

        temp = num;

        // Calculate the sum of powers of digits
        while (temp != 0) {
            int remainder = temp % 10;
            sum += Math.pow(remainder, digits);
            temp /= 10;
        }

        return sum == num;
    }
}
