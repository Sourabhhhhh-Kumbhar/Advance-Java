// ============================================
// THREADS (JAVA)
// ============================================
// WHY IT'S USED:
// Normally, a program runs one task at a time, line by line (single-threaded).
// But some tasks take time (downloading a file, heavy calculations, etc.)
// and you don't want the WHOLE program to freeze while waiting.
// Threads let you run multiple tasks at the SAME TIME (concurrently),
// so your program stays fast and responsive.

// WHAT IT IS:
// A Thread is a separate "path of execution" inside your program.
// You can create multiple threads that run independently of each other.

class MyThread extends Thread {
    // Overriding run() -> this is the code that will execute
    // when the thread starts (this defines WHAT the thread does)
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);

            try {
                Thread.sleep(500); // pauses this thread for 500ms
                // WHY sleep? -> simulates a time-consuming task
                // (like downloading data), without freezing other threads
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted!");
            }
        }
    }
}

public class CompleteThread {
    public static void main(String[] args) {

        // Creating two separate threads
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        // Naming them so output is easy to identify
        thread1.setName("Thread-1");
        thread2.setName("Thread-2");

        // start() -> begins running the thread's run() method
        // IMPORTANT: don't call run() directly, that just runs it
        // like a normal method on the SAME thread (no real concurrency)
        thread1.start();
        thread2.start();

        // Notice: both threads run TOGETHER (interleaved output),
        // not one after another -> that's the whole point of threads
        System.out.println("Main thread continues doing its own work...");
    }
}