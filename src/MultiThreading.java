// Multithreading.java
// Core concept: running multiple threads concurrently in Java

public class MultiThreading {

    // A simple task that a thread will run
    static class Worker extends Thread {
        private String taskName;

        Worker(String taskName) {
            this.taskName = taskName;
        }

        @Override
        public void run() {
            // This code runs on its own separate thread
            for (int i = 1; i <= 3; i++) {
                System.out.println(taskName + " - step " + i +
                        " (running on: " + Thread.currentThread().getName() + ")");
                try {
                    Thread.sleep(300); // simulate work being done
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Main thread starts: " + Thread.currentThread().getName());

        // Creating two separate threads
        Worker t1 = new Worker("Task-A");
        Worker t2 = new Worker("Task-B");

        // start() actually spins up a new thread and calls run() on it.
        // Calling run() directly would just execute it like a normal method
        // on the SAME thread — no concurrency.
        t1.start();
        t2.start();

        // Without join(), main might finish before t1/t2 do.
        try {
            t1.join(); // wait for t1 to finish
            t2.join(); // wait for t2 to finish
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        System.out.println("Main thread ends — both tasks are done.");
    }
}