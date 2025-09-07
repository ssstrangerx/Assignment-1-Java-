# Banking Application - Java Console Application

A simple Java console-based banking application that allows users to manage bank accounts with basic operations like creating accounts, depositing money, withdrawing money, and managing account details.

## Features

### Account Management
- ✅ Create new bank accounts with unique account numbers (auto-generated starting from 1001)
- ✅ Store account holder information (name, email, phone number)
- ✅ Set initial deposit amount during account creation

### Banking Operations
- ✅ Deposit money to existing accounts
- ✅ Withdraw money from accounts (with balance validation)
- ✅ View complete account details
- ✅ Update contact information (email and phone number)

### Data Management
- ✅ Support for multiple accounts (up to 100 accounts)
- ✅ Array-based storage system
- ✅ Account lookup by account number

## Technologies Used
- **Java** - Core programming language
- **Scanner Class** - For user input handling
- **Arrays** - For storing multiple account objects
- **Object-Oriented Programming** - Classes and methods implementation

## Project Structure

```
BankingApplication/
├── BankingApplication.java
├── Account.java (embedded)
└── UserInterface.java (embedded)
```

## Classes Overview

### Account Class
- **Attributes**: accountNumber, accountHolderName, balance, email, phoneNumber
- **Methods**: deposit(), withdraw(), displayAccountDetails(), updateContactDetails()

### UserInterface Class
- **Attributes**: accounts array, accountCount, scanner
- **Methods**: createAccount(), performDeposit(), performWithdrawal(), showAccountDetails(), updateContact(), mainMenu()

## How to Run

1. **Compile the Java file:**
   ```bash
   javac BankingApplication.java
   ```

2. **Run the application:**
   ```bash
   java BankingApplication
   ```

3. **Follow the menu prompts:**
   ```
   Welcome to the Banking Application!
   1. Create a new account
   2. Deposit money
   3. Withdraw money
   4. View account details
   5. Update contact details
   6. Exit
   ```

## Sample Usage

### Creating an Account
```
Enter your choice: 1
Enter account holder name: John Doe
Enter initial deposit amount: 1000.0
Enter email address: john.doe@example.com
Enter phone number: 1234567890
Account created successfully with Account Number: 1001
Please remember your Account Number: 1001 for future transactions.
```

### Making a Deposit
```
Enter your choice: 2
Enter account number: 1001
Enter amount to deposit: 500.0
Deposited: $500.0. New balance: $1500.0
```

### Withdrawing Money
```
Enter your choice: 3
Enter account number: 1001
Enter amount to withdraw: 200.0
Withdrawn: $200.0. New balance: $1300.0
```

## Input Validation

- ✅ Positive amounts for deposits and withdrawals
- ✅ Sufficient balance check for withdrawals
- ✅ Account existence verification
- ✅ Basic input handling for menu navigation

## Key Java Concepts Demonstrated

- **Object-Oriented Programming**: Classes, objects, encapsulation
- **Control Structures**: if-else statements, while loops
- **Arrays**: Static array for storing multiple objects
- **String Handling**: Managing text data for names and contact info
- **Input/Output**: Scanner class for user interaction
- **Method Design**: Modular code with specific responsibilities

## Assignment Details

This project was developed as part of Java Programming coursework covering:
- Basic Java programming concepts
- Control structures and decision making
- Array manipulation and management
- String operations and handling
- Object-oriented design principles

## Future Enhancements

- Add data persistence (file storage)
- Implement transaction history
- Add interest calculation features
- Enhanced input validation
- GUI interface using Swing/JavaFX

## Author

Developed for Java Programming Assignment - Banking Application for Account Management

## License

This project is created for educational purposes.
