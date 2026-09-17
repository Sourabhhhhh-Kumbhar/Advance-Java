// ThreadPriority.java
// Demonstrates how thread priority works in Java

public class ThreadPriority
{

    static class PriorityTask extends Thread
    {
        PriorityTask(String name)
        {
            super(name);
        }

        @Override
        public void run()
        {
            for (int i = 1; i <= 5; i++)
            {
                System.out.println(getName() + " (priority " + getPriority() + ") -> " + i);
            }
        }
    }

    public static void main(String[] args)
    {

        PriorityTask low  = new PriorityTask("LOW-Thread");
        PriorityTask norm = new PriorityTask("NORMAL-Thread");
        PriorityTask high = new PriorityTask("HIGH-Thread");

        // Thread priority range: 1 (MIN) to 10 (MAX), default is 5 (NORM)
        low.setPriority(Thread.MIN_PRIORITY);   // 1
        norm.setPriority(Thread.NORM_PRIORITY); // 5 (this is already default)
        high.setPriority(Thread.MAX_PRIORITY);  // 10

        System.out.println("Main thread priority: " + Thread.currentThread().getPriority());

        // Starting all three around the same time
        low.start();
        norm.start();
        high.start();

        try
        {
            low.join();
            norm.join();
            high.join();
        }
        catch (InterruptedException e)
        {
            Thread.currentThread().interrupt();
        }

        System.out.println("All threads done.");
    }
}