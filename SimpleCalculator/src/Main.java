public class Main {
    public static void main(String[] args) {
        SimpleCalculator calculator = new SimpleCalculator();
        SimpleCalculator calculator1 = new SimpleCalculator();
        calculator.setFirstNumber(15);
        calculator.setSecondNumber(10);
        System.out.println("Addition = " + calculator.getAdditionResult());
        System.out.println("Multiplication " + calculator.getMultiplicationResult());
        System.out.println("Subtraction " + calculator.getSubtractionResult());
        System.out.println("Division " + calculator.getDivisionResult() );
    }
}
