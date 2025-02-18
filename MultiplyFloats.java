import java.util.Scanner;

public class MultiplyFloats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        float num1 = scanner.nextFloat();

        System.out.print("Enter second number: ");
        float num2 = scanner.nextFloat();

        float result = num1 * num2;
        System.out.println("Multiplication result: " + result);

        scanner.close();
    }
}
