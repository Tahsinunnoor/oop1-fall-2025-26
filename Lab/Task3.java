
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Temperture(C):");
        double c = scanner.nextDouble();
        double f = (9 * c / 5) + 32;

        System.out.print("Temperture Celsius to Fahrenheit: " + f);

        scanner.close();
    }
}