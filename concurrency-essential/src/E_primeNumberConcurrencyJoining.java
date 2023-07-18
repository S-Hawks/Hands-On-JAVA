import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class E_primeNumberConcurrencyJoining {
    public static void main(String[] args) {
        List<Thread> threads = new ArrayList<>();
        //This thread is used for counting status. && use labda for runnable
        Runnable statusReporter = () -> {
            //pause for 5 second if not the next thread will not run.
            try{
                while (true){
                    Thread.sleep(5000);
                    printThread(threads);
                }
            }catch (InterruptedException e){
                System.out.println("Interrupted");
            }
        };
        Thread reporterThread = new Thread(statusReporter);
        reporterThread.setDaemon(true);
        reporterThread.start();

        //This thread is using for checking prime number multiple time enter by user.
        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.println("\n I can tell you the nth prime number. Enter n: ");
            int n = sc.nextInt();
            if(n == 0){
                reporterThread.interrupt();
                try{
                    System.out.println("Wating for all threads to finish...");
                    waitForThread(threads);
                    System.out.println("Done with the application. " + threads.size() + "primes");
                }catch (InterruptedException e){
                    System.out.println("\n Got interrupted when waiting for threads. Quitting...");
                }

                break;
            }
            Runnable r = new Runnable() {
                @Override
                public void run() {
                    int number = PrimeNumberUtil.calculatePrime(n);
                    System.out.println("\n Result:");
                    System.out.println("\n Value of " + n + "th prime: " + number);
                }
            };
            Thread t = new Thread(r);
            threads.add(t);
            t.start();
        }
    }

    private static void waitForThread(List<Thread> threads) throws InterruptedException{
        for(Thread thread: threads){
//            if(!thread.getState().equals(Thread.State.TERMINATED)){
//            basically thread.join do the if condition part, so it's not explicitly necessary essential to use if
               thread.join();
//            }
        }
    }

    //This method is printing thread status which was store in list
    private static void printThread(List<Thread> threads){
        System.out.println("Threads status: ");
        threads.forEach(thread -> {
            System.out.println(thread.getState() + " ");
        });
        System.out.println("");
    }
}
