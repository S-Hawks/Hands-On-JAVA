import java.util.Scanner;
import java.util.concurrent.*;

public class H_PrimeNumbersWithThreadPool {
    public static void main(String[] args) {

//       Specifies fixed number of thread. will not create extra thread which was declared.
//       ExecutorService executorService = Executors.newFixedThreadPool(3);
//        Create threads Dynamically.
//       ExecutorService cachedExecutorService = Executors.newCachedThreadPool();
//        Big thread pool size of one, only one thread is responsible for running thread.
//        ExecutorService singleExecutorService = Executors.newSingleThreadExecutor();
        ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) Executors.newFixedThreadPool(3);
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
        Runnable reporterRunnable = ()-> {
            System.out.println("Running repost");
            System.out.println("Active threads: " + threadPoolExecutor.getActiveCount());
            System.out.println("Completed threads: " + threadPoolExecutor.getCompletedTaskCount());
        };
        scheduledExecutorService.scheduleAtFixedRate(reporterRunnable,1, 5, TimeUnit.SECONDS);
        while(true){
            Scanner sc = new Scanner(System.in);
            System.out.println("\n I can tell you the nth prime number. Enter n");
            int n = sc.nextInt();
            if(n == 0) break;
            Runnable r = () -> {
                int number = PrimeNumberUtil.calculatePrime(n);
                System.out.println("\n Result:");
                System.out.println("\n Value of " + n + "th prime: " + number);
            };
//            executorService.execute(r);
            threadPoolExecutor.execute(r);
        }

    }
}
