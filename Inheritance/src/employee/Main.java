package employee;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(200000);
        HRManager hrManager = new HRManager(40000);

        employee.work();
        System.out.println("Employee salary: " + employee.getSalary());

        hrManager.work();
        System.out.println("Manager salary: " + hrManager.getSalary());
    }
}
