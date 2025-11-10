import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter price: ");
        double price = scanner.nextDouble();

        double discout = 0.15;
        double a = price * 0.15;

        System.out.print("Discounted price: " + a);
    }

}
