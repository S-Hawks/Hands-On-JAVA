import java.util.Scanner;

public class InputCalculator {
    public static void inputThenPrintSumAndAverage(){
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        long avg = 0;
        int counter = 0;
        while(true){
            boolean isAnInt = scanner.hasNextInt();
            counter++;
            if(isAnInt){
                int number = scanner.nextInt();
                sum += number;
                avg = Math.round((double)sum / (double)counter);
            }
            else{
                break;
            }
            scanner.nextLine();
        }
        System.out.println("SUM = " + sum + " AVG = " + avg);
        scanner.close();
    }
}
