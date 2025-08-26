public class Main {
    public static void main(String[] args) {
        System.out.println("Bank Name: " + BankAccount.bankName);
        System.out.println("Interest Rate: " + (BankAccount.interestRate * 100) + "%\n");

        BankAccount acc1 = new BankAccount("John Doe", 1000);
        BankAccount acc2 = new BankAccount("Jane Smith", 2500);
        BankAccount acc3 = new BankAccount("Bob Johnson", 500);

        System.out.println("\n═══ Account Operations ═══");
        acc1.deposit();
        acc2.withdraw();

        System.out.println("\n═══ Interest Calculation ═══");
        System.out.println(acc1.accountHolderName + "'s interest: $" + acc1.calculateInterest());
        System.out.println(acc2.accountHolderName + "'s interest: $" + acc2.calculateInterest());
        System.out.println(acc3.accountHolderName + "'s interest: $" + acc3.calculateInterest());

        System.out.println("\nTotal Accounts Created: " + BankAccount.totalAccounts);
    }
}
