package bankAccount;

public class CurrentAccount extends BankAccount {
    public CurrentAccount(String accountNumber, double balance){
        super(accountNumber, balance);
    }
    @Override
    public void deposit(double balance) {
        setBalance(getBalance() + balance);
        System.out.println("Deposit of $" + balance + " successful. Current balance is: $"+getBalance());
    }

    @Override
    public void withdraw(double balance) {
        if(getBalance() >= balance){
            setBalance(getBalance() - balance);
            System.out.println("Withdrawal of $ " + balance + " successful. Current balance: $" + getBalance());
        }else {
            System.out.println("Insufficient funds. Withdrawal failed");
        }
    }
}
