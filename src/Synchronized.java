public class Synchronized
{
    static int  counter = 0;

    static synchronized void increment()
    {
        counter++;
    }
    static class IncrementTask extends Thread
    {
        @Override
        public void run()
        {
            for (int i = 0; i <= 100000; i++)
            {
                increment();
            }
        }
    }

    public static void main(String[]args)throws InterruptedException
    {
        IncrementTask t1 = new IncrementTask();
        IncrementTask t2 = new IncrementTask();

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final Counter Value: " + counter);
    }
}
