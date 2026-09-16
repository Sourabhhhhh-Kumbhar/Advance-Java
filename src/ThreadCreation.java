// ============================================
// WAY 1: EXTENDING THE THREAD CLASS
// ============================================
// WHY: quick and simple, but this class CANNOT extend
// any other class (Java doesn't allow multiple inheritance)

class MyThreadd extends Thread
{
    public void run()
    {
        for (int i = 1; i <= 3; i++)
        {
            System.out.println(Thread.currentThread().getName() + " (Extends Thread) - Count: " + i);
            try {
                Thread.sleep(300);
            }
            catch (InterruptedException e) {
                System.out.println("Interrupted!");
            }
        }
    }
}


// ============================================
// WAY 2: IMPLEMENTING THE RUNNABLE INTERFACE
// ============================================
// WHY: more flexible — this class can still extend another
// class if needed, since Runnable is just an interface, not a base class
// This is the RECOMMENDED approach in real projects

class MyRunnable implements Runnable
{
    public void run()
    {
        for (int i = 1; i <= 3; i++)
        {
            System.out.println(Thread.currentThread().getName() + " (Implements Runnable) - Count: " + i);
            try {
                Thread.sleep(300);
            }
            catch (InterruptedException e) {
                System.out.println("Interrupted!");
            }
        }
    }
}


public class ThreadCreation
{
    public static void main(String[] args)
    {

        // ---- Using Way 1: Thread subclass ----
        MyThread t1 = new MyThread();
        t1.setName("Thread-A");
        t1.start(); // directly starts, since MyThread IS-A Thread

        // ---- Using Way 2: Runnable passed into a Thread object ----
        MyRunnable myTask = new MyRunnable();
        Thread t2 = new Thread(myTask); // wrap the task inside a Thread object
        t2.setName("Thread-B");
        t2.start(); // starts the thread, which internally calls myTask.run()

        System.out.println("Main thread finished starting both threads.");
    }
}