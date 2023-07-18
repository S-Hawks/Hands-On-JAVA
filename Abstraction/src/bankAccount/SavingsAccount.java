package bankAccount;

public class SavingsAccount extends BankAccount {
    public SavingsAccount(String accountNUmber, double balance) {
        super(accountNUmber, balance);
    }

    @Override
    public void deposit(double balance) {
        setBalance(getBalance() + balance);
        System.out.println("Deposit of $" + balance + " successful. Current balance: $ " + getBalance());
        ;

    }

    @Override
    public void withdraw(double balance) {
        if (getBalance() >= balance) {
            setBalance(getBalance() - balance);
            System.out.println("Withdrawal of $ " + balance + " successful. Current balance: $" + getBalance());
        } else {
            System.out.println("Insufficient funds. Withdrawal failed");
        }
    }
}
