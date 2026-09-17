// RaceCondition.java
// Demonstrates a race condition: multiple threads modifying shared data unsafely

public class RaceCondition {

    // Shared resource — both threads will read/modify this WITHOUT protection
    static int counter = 0;

    static class IncrementTask extends Thread {
        @Override
        public void run() {
            for (int i = 0; i < 100000; i++) {
                counter++;
                // counter++ looks like ONE operation, but it's actually 3 steps:
                // 1. read counter
                // 2. add 1
                // 3. write counter back
                // If two threads interleave these steps, updates get LOST.
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {

        IncrementTask t1 = new IncrementTask();
        IncrementTask t2 = new IncrementTask();

        t1.start();
        t2.start();

        t1.join(); // wait for both threads to finish
        t2.join();

        // Expected (if no race condition): 100000 + 100000 = 200000
        System.out.println("Final counter value: " + counter);
        // Actual output is usually LESS than 200000, and changes between runs!
        // That inconsistency IS the race condition.
    }
}