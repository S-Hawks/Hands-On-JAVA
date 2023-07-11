import java.util.List;

public class SumOfListOfNumber {
    public static <E extends Number> void sumArray(List<E> numberArray){
        double evenSum = 0;
        double oddSum = 0;
        for(E element : numberArray){
            if(element.doubleValue() % 2 == 0){
                evenSum += element.doubleValue();
            }
            else{
                oddSum += element.doubleValue();
            }
        }
        System.out.println("\nOriginal list of number: " + numberArray);
        System.out.println("Sum of even number: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    }

    public static void main(String[] args) {
        List<Integer> integers = List.of(1,2,3,4,5,6,7);
        List<Double> doubles = List.of(2.0, 1.4, 4.5, 2.5, 1.5);

        sumArray(integers);
        sumArray(doubles);
    }

}