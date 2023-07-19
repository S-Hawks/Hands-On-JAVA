import java.util.Scanner;
import java.util.concurrent.Semaphore;

public class L_PrimeNumberWithSemaphores {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(3);
        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.println("\n I can tell you the nth prime number. Enter n: ");
            int n = sc.nextInt();
            if(n == 0) break;
            Runnable r = new Runnable() {
                @Override
                public void run() {
                    try {
                        semaphore.acquire(); // semaphore.acquiredUnInterrupter
                        System.out.println("Now calculating for " + n);
                        int number = PrimeNumberUtil.calculatePrime(n);
                        System.out.println("\n Result:");
                        System.out.println("\n Value of " + n + " th prime: " + number);
                    } catch (InterruptedException e) {
                        System.out.println("Interrupted while acquiring");
                    }finally {
                        semaphore.release();
                    }
                }
            };
            Thread t = new Thread(r);
            t.setDaemon(true);
            t.start();
        }
    }
}
