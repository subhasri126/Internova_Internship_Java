class SecureBankAccount {

    private long accountNumber;
    private String accountHolderName;
    private double balance;

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}

abstract class Account {

    abstract void calculateInterest();

    void displayAccountType() {
        System.out.println("Account Type : Savings Account");
    }
}

class SavingsAccount extends Account {

    @Override
    void calculateInterest() {
        System.out.println("Interest calculation completed.");
    }
}

public class BankingSystem {

    public static void main(String[] args) {

        SecureBankAccount account = new SecureBankAccount();

        account.setAccountNumber(1001);
        account.setAccountHolderName("Subhasri");
        account.setBalance(25000.0);

        System.out.println("Banking System");
        System.out.println("--------------");
        System.out.println();

        System.out.println("Account Details");
        System.out.println("---------------");

        System.out.println("Account Number : "
                + account.getAccountNumber());

        System.out.println("Account Holder : "
                + account.getAccountHolderName());

        System.out.println("Balance        : "
                + account.getBalance());

        account.setBalance(30000.0);

        System.out.println();
        System.out.println("Updated Balance");
        System.out.println("---------------");
        System.out.println("Balance        : "
                + account.getBalance());

        System.out.println();
        System.out.println("Account Functionality");
        System.out.println("---------------------");

        SavingsAccount savingsAccount = new SavingsAccount();

        savingsAccount.displayAccountType();
        savingsAccount.calculateInterest();
    }
}