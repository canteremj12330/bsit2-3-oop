class BankAccount {
    static String bankName = "Liceo Bank";
    static int totalAccounts = 0;
    static double interestRate = 0.03;
    static int accountCounter = 1;

    static String generateAccountNumber() {
        String accNum = "ACC" + accountCounter;
        accountCounter++;
        return accNum;
    }

    String accountNumber;
    String accountHolderName;
    double balance;

    BankAccount(String name, double initialBalance) {
        accountNumber = generateAccountNumber();
        accountHolderName = name;
        balance = initialBalance;
        totalAccounts++;
        System.out.println("Account Created: " + accountNumber + " for " + accountHolderName + " with initial balance: " + balance);
    }

    void deposit() {
        balance = balance + (double) 500;
        System.out.println(accountHolderName + " deposited " + (double) 500 + ". New balance: " + balance);
    }

    void withdraw() {
        if ((double) 300 <= balance) {
            balance = balance - (double) 300;
            System.out.println(accountHolderName + " withdrew " + (double) 300 + ". New balance: " + balance);
        } else {
            System.out.println(accountHolderName + " withdrawal failed. Insufficient balance.");
        }
    }

    double calculateInterest() {
        return balance * interestRate;
    }
}
