/* Mainly denote as structured lock because everything
get handled by JVM and used synchronized keyword for critical section
*/
class Counter implements Runnable{
    private int value = 0;
//    private Integer i = 10;
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
        //Providing each thread a lock, One thread can access the synchronized block
        //Often refer as critical section(synchronized monitor) at a time.
        //"this" can be replaced with any objectReference, here "this" is "counter instance" reference.
        synchronized (this) {
            this.increment();
            System.out.println(Thread.currentThread().getName() + " increments: " + this.getValue());
            this.decrement();
            System.out.println(Thread.currentThread().getName() + " decrement " + this.getValue());
        }
    }
}
public class F_Synchronized {
    public static void main(String[] args) {
        Counter counter = new Counter();
        new Thread(counter, "One").start();
        new Thread(counter, "Two").start();
        new Thread(counter, "Three").start();
        new Thread(counter, "Four").start();

    }
}
