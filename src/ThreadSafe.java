// Shared object accessed by multiple threads.
// count is NOT thread-safe on its own — count++ is 3 steps
// (read, add 1, write back), so two threads can interleave
// and lose an update.
class Counter
{
    int count;

    public void increment()
    {
        count++;
    }
}

public class ThreadSafe
{
    // main can throw InterruptedException because join() can throw it
    // (if some other thread interrupts main while it's waiting)
    public static void main(String[] args) throws InterruptedException
    {
        Counter c = new Counter();

        // Task for thread 1: increment the shared counter 1000 times
        Runnable obj1 = () ->
        {
            for (int i = 1; i <= 1000; i++)
            {
                c.increment();
            }
        };

        // Task for thread 2: same job, running concurrently with obj1
        Runnable obj2 = () ->
        {
            for (int i = 1; i <= 1000; i++)
            {
                c.increment();
            }
        };

        // Wrap each Runnable in a Thread object.
        // At this point the threads exist but are NOT running yet.
        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        // start() actually launches each thread to run concurrently.
        // Without this, the Runnables never execute.
        t1.start();
        t2.start();

        // join() blocks main here until t1 finishes running.
        // Must come AFTER start() — joining a thread that hasn't
        // started yet returns immediately since it's not "alive".
        t1.join();

        // Same for t2 — wait for it to finish too.
        t2.join();

        // By this point BOTH threads have completed, so count
        // reflects all 2000 increments... assuming increment()
        // is actually safe from race conditions (see note above).
        System.out.println("Count is " + c.count);
    }
}

//"Thread-safe" describes code that behaves correctly when multiple threads access it at
//the same time, without needing any extra synchronization from the caller.
//
//The core idea
//
//When two or more threads read and write shared data concurrently,
//their operations can interleave in unpredictable ways.
//If that interleaving can corrupt the data or produce wrong results,
//the code is not thread-safe. If the code guarantees correct behavior no matter how the t
//hreads are scheduled or interleaved, it is thread-safe.