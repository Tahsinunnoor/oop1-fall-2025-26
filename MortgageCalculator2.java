import java.util.Scanner;

public class MortgageCalculator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double salary = 0;
        int creditScore = 0;
        boolean criminalRecord = false;
        double loanAmount = 0;
        double annualRate = 0;
        int years = 0;

        // salary input
        while (true) {
            System.out.print("Enter your monthly salary: ");
            if (scanner.hasNextDouble()) {
                salary = scanner.nextDouble();
                break;
            } else {
                System.out.println("Please enter a number value.");
                scanner.next();
            }
        }

        // credit score
        while (true) {
            System.out.print("Enter your credit score (0 - 500): ");
            if (scanner.hasNextInt()) {
                creditScore = scanner.nextInt();
                if (creditScore >= 0 && creditScore <= 500) {
                    break;
                } else {
                    System.out.println("Credit score must be between 0 and 500.");
                }
            } else {
                System.out.println("Please enter an integer value.");
                scanner.next();
            }
        }

        // criminal record
        while (true) {
            System.out.print("Do you have a criminal record? (true/false): ");
            if (scanner.hasNextBoolean()) {
                criminalRecord = scanner.nextBoolean();
                break;
            } else {
                System.out.println("Please enter true or false.");
                scanner.next();
            }
        }

        // checking if not eligible due to criminal record
        if (criminalRecord) {
            System.out.println("You are not eligible for a loan due to criminal record.");
            return;
        }

        // loan amount
        while (true) {
            System.out.print("Enter your desired loan amount: ");
            if (scanner.hasNextDouble()) {
                loanAmount = scanner.nextDouble();
                if (loanAmount <= salary * 2) {
                    break;
                } else {
                    System.out.println("You are not eligible for this loan amount. Maximum allowed is " + (salary * 2));
                }
            } else {
                System.out.println("Please enter a number value.");
                scanner.next();
            }
        }

        // interest rate
        while (true) {
            System.out.print("Enter annual interest rate (in %): ");
            if (scanner.hasNextDouble()) {
                annualRate = scanner.nextDouble();
                break;
            } else {
                System.out.println("Please enter a number value.");
                scanner.next();
            }
        }

        // loan period
        while (true) {
            System.out.print("Enter loan period in years: ");
            if (scanner.hasNextInt()) {
                years = scanner.nextInt();
                break;
            } else {
                System.out.println("Please enter an integer value.");
                scanner.next();
            }
        }

        // calculation
        double monthlyRate = (annualRate / 100) / 12;
        int totalMonths = years * 12;
        double monthlyPayment = loanAmount * (monthlyRate * Math.pow(1 + monthlyRate, totalMonths))
                / (Math.pow(1 + monthlyRate, totalMonths) - 1);

        System.out.print("Monthly Mortgage Payment: BDT " + monthlyPayment);
    }
}
