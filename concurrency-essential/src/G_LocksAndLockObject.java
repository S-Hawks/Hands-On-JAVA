import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/*Unstructured(which is mainly define by user)
locks and lock object -> mainly achieve by ReentrantLock
 */
class Counter1 implements Runnable{
    private int value = 0;
    //    private Integer i = 10;
    private Lock l = new ReentrantLock();
    public void increment(){
        try{
            Thread.sleep(20);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        value++;
    }
    public void decrement(){ value--;};

    public int getValue() { return value; }
    @Override
    public void run() {
        l.lock(); //acquire a lock
        try{

            this.increment();
            System.out.println(Thread.currentThread().getName() + " increments: " + this.getValue());
            this.decrement();
            System.out.println(Thread.currentThread().getName() + " decrement " + this.getValue());
        }finally {

            l.unlock(); //Release lock
        }
    }
}
public class G_LocksAndLockObject {
    public static void main(String[] args) {
        Counter1 counter1 = new Counter1();
        new Thread(counter1, "One").start();
        new Thread(counter1, "Two").start();
        new Thread(counter1, "Three").start();
        new Thread(counter1, "Four").start();

    }
}
