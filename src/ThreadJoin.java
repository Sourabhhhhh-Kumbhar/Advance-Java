class Worker extends Thread
{
    public void run()
    {
        for (int i = 0; i <= 5; i++)
        {
            System.out.println(Thread.currentThread().getName() + "-" +i);

            try
            {
                Thread.sleep(500);
            }
            catch (InterruptedException e)
            {
                System.out.println("Interrupted!!!!");
            }
        }
    }
}

public class ThreadJoin
{
    public static void main(String[] args) throws InterruptedException
    {
        Worker w1 = new Worker();
        Worker w2 = new Worker();

        w1.start();
        w2.start();

        w1.join(); //Main thread waits t1 to finish
        w2.join(); //Main thread waits t2 to finish

        System.out.println("All threads done.");
    }
}