public class main {
    public static void main(String[] args) {
        Bank bank = new Bank("National Bank");

        bank.addBranch("Adelaide");
        bank.addCustomer("Adelaide", "Mike", 50.50);
        bank.addCustomer("Adelaide", "Samir", 175.34);
        bank.addCustomer("Adelaide", "Percy", 220.12 );

        bank.addBranch("Sydney");
        bank.addCustomer("Sydney", "Bob", 150.54);

        bank.addCustomerTransaction("Adelaide", "Samir", 44.22);
        bank.addCustomerTransaction("Adelaide", "Samir", 12.44);
        bank.addCustomerTransaction("Adelaide", "Samir", 1.65);

        bank.listCustomers("Adelaide", true);
        bank.listCustomers("Sydney", true);

        bank.addBranch("Melbourne");
        if(!bank.addCustomer("Melbourne", "Brain", 5.53)){
            System.out.println("Error Melbourne branch do not exist");
        }



    }
}
