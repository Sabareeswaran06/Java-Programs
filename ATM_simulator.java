import java.util.Scanner;

class ATMSimulator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        String correctPin = "1234";  
        double balance = 1000.0;  
        boolean authenticated = false;
        
        
        System.out.println("Welcome to the ATM Simulator");

      
        for (int attempts = 0; attempts < 3; attempts++) {
            System.out.print("Enter your PIN: ");
            String enteredPin = scanner.nextLine();
            
            if (enteredPin.equals(correctPin)) {
                authenticated = true;
                System.out.println("PIN verified successfully.\n");
                break;
            } else {
                System.out.println("Incorrect PIN. Try again.");
            }
        }
        
        
        if (!authenticated) {
            System.out.println("Too many incorrect attempts. Exiting...");
            return;
        }
        
  
        int choice;
        do {
            System.out.println("\nATM Menu:");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
             
                    System.out.println("Your current balance is: $" + balance);
                    break;

                case 2:
                  
                    System.out.print("Enter the amount to deposit: $");
                    double depositAmount = scanner.nextDouble();
                    if (depositAmount > 0) {
                        balance += depositAmount;
                        System.out.println("You have deposited $" + depositAmount + ".");
                        System.out.println("Your new balance is: $" + balance);
                    } else {
                        System.out.println("Invalid deposit amount.");
                    }
                    break;

                case 3:
                   
                    System.out.print("Enter the amount to withdraw: $");
                    double withdrawAmount = scanner.nextDouble();
                    if (withdrawAmount <= balance && withdrawAmount > 0) {
                        balance -= withdrawAmount;
                        System.out.println("You have withdrawn $" + withdrawAmount + ".");
                        System.out.println("Your remaining balance is: $" + balance);
                    } else if (withdrawAmount > balance) {
                        System.out.println("Insufficient funds! Your balance is $" + balance);
                    } else {
                        System.out.println("Invalid withdrawal amount.");
                    }
                    break;

                case 4:
                 
                    System.out.println("Thank you for using the ATM. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
