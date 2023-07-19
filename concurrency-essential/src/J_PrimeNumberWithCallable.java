import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.*;

public class J_PrimeNumberWithCallable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Future<Integer>> futures = new ArrayList<>();
        ExecutorService executorService = Executors.newCachedThreadPool();
        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.println("\n I can tell you the nth prime number. Enter n: ");
            int n = sc.nextInt();
            if(n == 0) break;
            Callable<Integer> c = new Callable<Integer>() {
                @Override
                public Integer call() throws Exception {
                    return PrimeNumberUtil.calculatePrime(n);
                }
            };
            Future<Integer> primeNumberFuture = executorService.submit(c);
            futures.add(primeNumberFuture);

        }
        Iterator<Future<Integer>> iterator = futures.iterator();
        while(iterator.hasNext()){
            Future<Integer> f = iterator.next();
            if(f.isDone()){
                System.out.println(f.get());
                iterator.remove();
            }
        }
    }
}
