
// Fixes the race condition using the "synchronized" keyword

public class Synchronized {

    static int counter = 0;

    // synchronized method: only ONE thread can execute this method
    // on the same object at a time. Others must wait their turn.
    static synchronized void increment() {
        counter++;
        // Now counter++ (read -> add -> write) happens as one
        // uninterrupted unit — no other thread can jump in between.
    }

    static class IncrementTask extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 100000; i++) {
                increment(); // calling the synchronized method
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {

        IncrementTask t1 = new IncrementTask();
        IncrementTask t2 = new IncrementTask();

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        // Now this will ALWAYS print exactly 200000, every single run
        System.out.println("Final counter value: " + counter);
    }
}


//Two Ways To Create Synchronized

//// 1. Synchronized METHOD (locks on "this" object automatically)
//static synchronized void increment() {
//    counter++;
//}
//
/// / 2. Synchronized BLOCK (locks on a specific object — more control, better performance)
//static final Object lock = new Object();
//
//static void incrementBlock() {
//    synchronized (lock) {
//        counter++;
//    }
//    // Only the critical section is locked, not the whole method —
//    // useful when a method does other work that doesn't need protection.
//}