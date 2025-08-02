
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total = 0;
        int number;

        for (int a = 1; a <= 5; a++) {
            System.out.print("Enter number " + a + ": ");
            number = scan.nextInt();
            total += number;
        }
        System.out.println("\nTotal Number: " + total);

    }
}
