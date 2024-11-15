

import java.util.Scanner;

class InterestCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the principal amount (P): ");
        double principal = scanner.nextDouble();

        System.out.print("Enter the annual rate of interest (R in %): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter the time period (T in years): ");
        int time = scanner.nextInt();

        
        double simpleInterest = (principal * rate * time) / 100;

        
        System.out.print("Enter the number of times interest is compounded per year (n): ");
        int n = scanner.nextInt();

        double compoundInterest = principal * Math.pow(1 + (rate / (n * 100)), n * time) - principal;

       
        System.out.println("\n--- Interest Calculations ---");
        System.out.println("Simple Interest (SI): " + simpleInterest);
        System.out.println("Compound Interest (CI): " + compoundInterest);

        scanner.close();
    }
}

