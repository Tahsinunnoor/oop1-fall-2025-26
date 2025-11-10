import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 1st integer: ");
        int a = scanner.nextInt();

        System.out.print("Enter 2nd integer: ");
        int b = scanner.nextInt();

        System.out.println("Before swapping: a = " + a + ", b = " + b);

        a = a + b;

        b = a - b;

        a = a - b;

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
