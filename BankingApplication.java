import java.util.Scanner;

// Account class
class Account {
    int accountNumber;
    String accountHolderName;
    double balance;
    String email;
    String phoneNumber;
    
    static int nextAccountNumber = 1001;
    
    // Constructor
    public Account(String accountHolderName, double initialDeposit, String email, String phoneNumber) {
        this.accountNumber = nextAccountNumber++;
        this.accountHolderName = accountHolderName;
        this.balance = initialDeposit;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    
    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Amount must be positive!");
        }
    }
    
    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount + ". New balance: $" + balance);
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            System.out.println("Amount must be positive!");
        }
    }
    
    // Display account details
    public void displayAccountDetails() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Name: " + accountHolderName);
        System.out.println("Balance: $" + balance);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phoneNumber);
        System.out.println("----------------------");
    }
    
    // Update contact details
    public void updateContactDetails(String email, String phoneNumber) {
        this.email = email;
        this.phoneNumber = phoneNumber;
        System.out.println("Contact details updated!");
    }
    
    // Get account number
    public int getAccountNumber() {
        return accountNumber;
    }
}

// User Interface class
class UserInterface {
    Account[] accounts = new Account[100];
    int accountCount = 0;
    Scanner scanner = new Scanner(System.in);
    
    // Create new account
    public void createAccount() {
        System.out.print("Enter account holder name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter initial deposit amount: ");
        double deposit = scanner.nextDouble();
        scanner.nextLine(); // consume newline
        
        System.out.print("Enter email address: ");
        String email = scanner.nextLine();
        
        System.out.print("Enter phone number: ");
        String phone = scanner.nextLine();
        
        Account newAccount = new Account(name, deposit, email, phone);
        accounts[accountCount] = newAccount;
        accountCount++;
        
        System.out.println("Account created successfully with Account Number: " + newAccount.getAccountNumber());
        System.out.println("Please remember your Account Number: " + newAccount.getAccountNumber() + " for future transactions.");
    }
    
    // Deposit money
    public void performDeposit() {
        System.out.print("Enter account number: ");
        int accNum = scanner.nextInt();
        
        Account account = findAccount(accNum);
        if (account != null) {
            System.out.print("Enter amount to deposit: ");
            double amount = scanner.nextDouble();
            account.deposit(amount);
        } else {
            System.out.println("Account not found!");
        }
    }
    
    // Withdraw money
    public void performWithdrawal() {
        System.out.print("Enter account number: ");
        int accNum = scanner.nextInt();
        
        Account account = findAccount(accNum);
        if (account != null) {
            System.out.print("Enter amount to withdraw: ");
            double amount = scanner.nextDouble();
            account.withdraw(amount);
        } else {
            System.out.println("Account not found!");
        }
    }
    
    // Show account details
    public void showAccountDetails() {
        System.out.print("Enter account number: ");
        int accNum = scanner.nextInt();
        
        Account account = findAccount(accNum);
        if (account != null) {
            account.displayAccountDetails();
        } else {
            System.out.println("Account not found!");
        }
    }
    
    // Update contact details
    public void updateContact() {
        System.out.print("Enter account number: ");
        int accNum = scanner.nextInt();
        scanner.nextLine(); // consume newline
        
        Account account = findAccount(accNum);
        if (account != null) {
            System.out.print("Enter new email: ");
            String email = scanner.nextLine();
            
            System.out.print("Enter new phone number: ");
            String phone = scanner.nextLine();
            
            account.updateContactDetails(email, phone);
        } else {
            System.out.println("Account not found!");
        }
    }
    
    // Main menu
    public void mainMenu() {
        System.out.println("Welcome to the Banking Application!");
        
        int choice = 0;
        while (choice != 6) {
            System.out.println("\n1. Create a new account");
            System.out.println("2. Deposit money");
            System.out.println("3. Withdraw money");
            System.out.println("4. View account details");
            System.out.println("5. Update contact details");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            
            choice = scanner.nextInt();
            scanner.nextLine(); // consume newline
            
            if (choice == 1) {
                createAccount();
            } else if (choice == 2) {
                performDeposit();
            } else if (choice == 3) {
                performWithdrawal();
            } else if (choice == 4) {
                showAccountDetails();
            } else if (choice == 5) {
                updateContact();
            } else if (choice == 6) {
                System.out.println("Thank you for using Banking Application!");
            } else {
                System.out.println("Invalid choice!");
            }
        }
    }
    
    // Find account by number
    private Account findAccount(int accountNumber) {
        for (int i = 0; i < accountCount; i++) {
            if (accounts[i].getAccountNumber() == accountNumber) {
                return accounts[i];
            }
        }
        return null;
    }
}

// Main class
public class BankingApplication {
    public static void main(String[] args) {
        UserInterface ui = new UserInterface();
        ui.mainMenu();
    }
}