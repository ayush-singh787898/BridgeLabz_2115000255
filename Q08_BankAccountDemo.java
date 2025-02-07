import java.util.Scanner;

class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void displayAccountType() {
        System.out.println("Account Type: General Bank Account");
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    void displayAccountType() {
        System.out.println("Account Type: Savings Account");
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    void displayAccountType() {
        System.out.println("Account Type: Checking Account");
        System.out.println("Withdrawal Limit: " + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    int tenure;

    FixedDepositAccount(String accountNumber, double balance, int tenure) {
        super(accountNumber, balance);
        this.tenure = tenure;
    }

    @Override
    void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        System.out.println("Tenure: " + tenure + " months");
    }
}

public class Q08_BankAccountDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Savings Account details");
        System.out.print("Account Number: ");
        String savingsAccountNumber = sc.nextLine();
        System.out.print("Balance: ");
        double savingsBalance = sc.nextDouble();
        System.out.print("Interest Rate: ");
        double interestRate = sc.nextDouble();
        SavingsAccount savingsAccount = new SavingsAccount(savingsAccountNumber, savingsBalance, interestRate);
        savingsAccount.displayAccountType();

        sc.nextLine();

        System.out.println("\nEnter Checking Account details");
        System.out.print("Account Number: ");
        String checkingAccountNumber = sc.nextLine();
        System.out.print("Balance: ");
        double checkingBalance = sc.nextDouble();
        System.out.print("Withdrawal Limit: ");
        double withdrawalLimit = sc.nextDouble();
        CheckingAccount checkingAccount = new CheckingAccount(checkingAccountNumber, checkingBalance, withdrawalLimit);
        checkingAccount.displayAccountType();

        sc.nextLine();

        System.out.println("\nEnter Fixed Deposit Account details");
        System.out.print("Account Number: ");
        String fdAccountNumber = sc.nextLine();
        System.out.print("Balance: ");
        double fdBalance = sc.nextDouble();
        System.out.print("Tenure (in months): ");
        int tenure = sc.nextInt();
        FixedDepositAccount fdAccount = new FixedDepositAccount(fdAccountNumber, fdBalance, tenure);
        fdAccount.displayAccountType();

        sc.close();
    }
}
