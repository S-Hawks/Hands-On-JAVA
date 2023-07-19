import java.util.Scanner;
import java.util.concurrent.CompletableFuture;

public class K_PrimeNumberWithCompletableFuture {
    public static void main(String[] args) {
        int number;
        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.println("\n I can tell you the nth prime number. Enter n: ");
            int n = sc.nextInt();
            if(n == 0) break;
            /*Here completableFuture lambda is calculating prime number
            * though it's a supplier it's return a value and then another lambda take it and sout return value,
            * so it doesn't wait for the result which was cons in Future object
            * means we immediately get the result back*/
            CompletableFuture.supplyAsync(() -> PrimeNumberUtil.calculatePrime(n))         // supplier so "hello" give back a value.
                    .thenAccept((Integer returnValue) -> System.out.println(returnValue)); //This line can also be replaced with lambda interface.

        }
    }
}
