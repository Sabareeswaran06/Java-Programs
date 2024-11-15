import java.util.Scanner;

class TemperatureConverter {
    static Scanner sc = new Scanner(System.in);
    static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }
    static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }
    public static void main(String[] args) {
        System.out.println("Temperature Converter");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.println("3. Exit");

        while (true) {
            System.out.print("\nEnter your choice: ");
            int choice = sc.nextInt();
            double inputTemp, convertedTemp;

            switch (choice) {
                case 1:
                    System.out.print("Enter Celsius: ");
                    inputTemp = sc.nextDouble();
                    convertedTemp = celsiusToFahrenheit(inputTemp);
                    System.out.printf("Fahrenheit: %.2f\n", convertedTemp);
                    break;
                case 2:
                    System.out.print("Enter Fahrenheit: ");
                    inputTemp = sc.nextDouble();
                    convertedTemp = fahrenheitToCelsius(inputTemp);
                    System.out.printf("Celsius: %.2f\n", convertedTemp);
                    break;
                case 3:
                    System.out.println("Exiting...");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
