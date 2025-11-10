import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lone Amount: ");
        double p = scanner.nextDouble();

        System.out.print("Monthly Interest rate: ");
        double rate = scanner.nextDouble();
        double r = rate / 100 / 12;

        System.out.print("Lone Term: ");
        Double Term = scanner.nextDouble();
        double n = Term * 12;

        double power = Math.pow(1 + r, n);

        double payment = (p * r * power) / (power - 1);
        System.out.print("Retrun: " + payment);
    }

}
