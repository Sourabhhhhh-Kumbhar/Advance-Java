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
            for(int i = 1; i <= 5; i++)
            {
                System.out.println(getName() + "(priority " + getPriority() + ") -> " + i);
            }
        }
    }
    public static void main(String[] args)
    {
        PriorityTask low = new PriorityTask("LOW - Thread");
        PriorityTask norm = new PriorityTask("NORM - Thread");
        PriorityTask high = new PriorityTask("HIGH - Thread");

        low.setPriority(Thread.MIN_PRIORITY);
        norm.setPriority(Thread.MIN_PRIORITY);
        high.setPriority(Thread.MAX_PRIORITY);

        System.out.println("Main thread priority: " + Thread.currentThread().getPriority());

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

        System.out.println("All Threads Are Done");
    }
}
