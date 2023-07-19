import java.util.concurrent.*;

public class I_CallableExample {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Printed from Runnable");
            }
        };
        Callable<String> c = new Callable<String>() {
            @Override
            public String call() throws Exception {
                System.out.println("Printed from Callable");
                return "Value from callable";
            }
        };
        ExecutorService executorService = Executors.newFixedThreadPool(1);
//        executorService.submit(c);
        //Get the return value of callable-> It's the ability to get something while thread
        //is running
        Future<String> ret = executorService.submit(c);
        String retStr = ret.get();
        System.out.println(retStr);
    }
}
