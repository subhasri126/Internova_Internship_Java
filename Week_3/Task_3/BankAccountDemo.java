class BankAccount {

    String accountHolderName;
    long accountNumber;
    double balance;

    static int totalAccounts = 0;

    BankAccount(String accountHolderName, long accountNumber, double balance) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
        totalAccounts++;
    }

    void displayAccount() {
        System.out.println("Account Holder : " + accountHolderName);
        System.out.println("Account Number : " + accountNumber);
        System.out.println("Balance        : " + balance);
        System.out.println();
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {

        BankAccount account1 =
                new BankAccount("Subhasri S", 1001, 25000.0);

        BankAccount account2 =
                new BankAccount("Sathish", 1002, 30000.0);

        BankAccount account3 =
                new BankAccount("Vasundra", 1003, 20000.0);

        
        System.out.println("Bank Account");
        System.out.println("------------");
        System.out.println();

        System.out.println("Account 1");
        System.out.println("---------");
        account1.displayAccount();

        System.out.println("Account 2");
        System.out.println("---------");
        account2.displayAccount();

        System.out.println("Account 3");
        System.out.println("---------");
        account3.displayAccount();

        System.out.println("Total Accounts : " + BankAccount.totalAccounts);
    }
}