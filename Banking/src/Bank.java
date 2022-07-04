import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name){
        this.name = name;
        this.branches = new ArrayList<Branch>();
    }
    public boolean addBranch(String brunchName){
        if(findBranch(brunchName) == null){
            this.branches.add(new Branch(brunchName));
            return true;
        }
        return false;
    }
    public boolean addCustomer(String brunchName, String customerName, double initialAmount){
        Branch branch = findBranch(brunchName);
        if(branch != null){
            return branch.newCustomer(customerName, initialAmount);
        }
        return false;
    }
    public boolean addCustomerTransaction(String branchName, String customerName, double amount){
        Branch branch = findBranch(branchName);
        if(branch != null){
            return branch.addCustomerTransaction(customerName, amount);
        }
        return false;
    }
    private Branch findBranch(String branchName){
        for(int i = 0; i < branches.size(); i++){
            Branch existingBranch = branches.get(i);
            if(existingBranch.getName().equals(branchName)){
                return existingBranch;
            }
        }
        return null;
    }
    public boolean listCustomers(String branchName, boolean showTransaction){
        Branch branch = findBranch(branchName);
        if(branch != null && showTransaction){
            System.out.println("Customer details for branch " + branch.getName());

            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for(int i = 0; i< branchCustomers.size(); i++){
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer: " + branchCustomer.getName() + "[" + (i+1) + "]" );
                if(showTransaction){
                    System.out.println("Transaction");
                    ArrayList<Double> transaction = branchCustomer.getTransaction();
                    for(int j = 0; j < transaction.size(); j++){
                        System.out.println("[" + (j + 1) + "] Amount " + transaction.get(j));
                    }
                }
            }
            return true;
        }
        else if(branch != null){
            System.out.println("Customer details for branch " + branch.getName());
            for(int i=0; i < branch.getCustomers().size(); i++){
                System.out.println("Customer: " + branch.getCustomers().get(i).getName() + "[" + (i + 1) + "]");
            }
            return true;
        }
        else{
            return false;
        }
    }
}
