import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your 1st Marks: ");
        double a = scanner.nextDouble();

        System.out.print("Enter your 2nd Marks: ");
        double b = scanner.nextDouble();

        System.out.print("Enter your 3rd Marks: ");
        double c = scanner.nextDouble();

        double addition = a + b + c;
        double avg = addition / 3;

        System.out.print("Average marks: " + avg);

        scanner.close();
    }
}