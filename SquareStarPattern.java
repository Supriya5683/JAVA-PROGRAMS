import java.util.Scanner;

public class SquareStarPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows (or columns): ");
        int size = scanner.nextInt();

        // Print the square pattern
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
