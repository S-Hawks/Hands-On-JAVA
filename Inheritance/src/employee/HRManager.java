package employee;

public class HRManager extends Employee {
    public HRManager(int salary) {
        super(salary);
    }

    @Override
    public void work() {
        System.out.println("\nManaging Employee");
    }
    public void addEmployee(){
        System.out.println("\nAdding new employee");
    }
}
