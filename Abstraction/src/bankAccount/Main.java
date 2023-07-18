package bankAccount;

public class Main {
    public static void main(String[] args) {
        double initialAmount, dipositAmmount, withDrawAmmount;
        initialAmount = 1000.0;
        SavingsAccount savingsAccount = new SavingsAccount("SA001", initialAmount);
        System.out.println("Saving A/c: Initial Balance: $ "+initialAmount);
        dipositAmmount = 4000;
        savingsAccount.deposit(dipositAmmount);
        withDrawAmmount = 2000;
        System.out.println("\nTry to withdraw: $"+withDrawAmmount);
        savingsAccount.withdraw(withDrawAmmount);

    }
}
