package Car;

public class Car extends Vehicle{
    @Override
    public void drive() {
        System.out.println("Repairing Car, Not in condition to drive");
    }
}
