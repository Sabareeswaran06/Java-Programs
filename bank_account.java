import java.util.Scanner;

class BankAccount {
    private String accountHolder;
    private double balance;
    

    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }


    public void checkBalance() {
        System.out.println("Current balance: $" + balance);
    }

    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("$" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("$" + amount + " withdrawn successfully.");
        } else if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            System.out.println("Invalid withdrawal amount.");
        }
    }

    
    public void transfer(BankAccount toAccount, double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            toAccount.deposit(amount);
            System.out.println("$" + amount + " transferred to " + toAccount.getAccountHolder() + ".");
        } else if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            System.out.println("Invalid transfer amount.");
        }
    }

  
    public String getAccountHolder() {
        return accountHolder;
    }
}

class SimpleBankAccountApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        BankAccount account1 = new BankAccount("Alice", 1000.0);
        BankAccount account2 = new BankAccount("Bob", 500.0);

        int choice;
        do {
        
            System.out.println("\n--- Bank Account Menu ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Transfer Money");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                
                    System.out.println("\nAccount holder: " + account1.getAccountHolder());
                    account1.checkBalance();
                    break;

                case 2:
                
                    System.out.print("Enter amount to deposit: $");
                    double depositAmount = scanner.nextDouble();
                    account1.deposit(depositAmount);
                    break;

                case 3:
                  
                    System.out.print("Enter amount to withdraw: $");
                    double withdrawAmount = scanner.nextDouble();
                    account1.withdraw(withdrawAmount);
                    break;

                case 4:
                   
                    System.out.print("Enter amount to transfer to Bob: $");
                    double transferAmount = scanner.nextDouble();
                    account1.transfer(account2, transferAmount);
                    break;

                case 5:
                    
                    System.out.println("Thank you for using the Bank Account App. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 5);

        scanner.close();
    }
}
