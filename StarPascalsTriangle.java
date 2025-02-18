import java.util.Scanner;

public class StarPascalsTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        for (int i = 0; i < rows; i++) {
            // Print leading spaces
            for (int j = 0; j < rows - i - 1; j++) {
                System.out.print(" ");
            }

            // Print stars according to Pascal's Triangle pattern
            for (int j = 0; j <= i; j++) {
                // Using combination formula (nCk) to print stars
                if (j == 0 || j == i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // Space between stars
                }
            }

            System.out.println();
        }

        scanner.close();
    }
}
