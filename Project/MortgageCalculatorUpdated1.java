import java.util.Scanner;

public class MortgageCalculator1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Loan Amount: ");
        double loan = scanner.nextDouble();

        System.out.print("Annual Interest Rate (%): ");
        double annualRate = scanner.nextDouble();

        System.out.print("Loan Term (in years): ");
        double years = scanner.nextDouble();

        double monthlyRate = (annualRate / 100) / 12;
        double totalMonths = years * 12;

        double monthlyPayment = loan * (monthlyRate * Math.pow(1 + monthlyRate, totalMonths))
                / (Math.pow(1 + monthlyRate, totalMonths) - 1);

        System.out.println("Monthly Mortgage Payment: " + monthlyPayment);
    }
}
