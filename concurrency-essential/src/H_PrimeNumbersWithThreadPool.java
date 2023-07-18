import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class H_PrimeNumbersWithThreadPool {
    public static void main(String[] args) {
//        ExecutorService executorService =

        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("\n I can tell you the nth prime number. Enter n");
            int n = sc.nextInt();
            if(n == 0) break;
            Runnable r = () -> {
                System.out.println("Do something");
            };
         
        }
    }
}
