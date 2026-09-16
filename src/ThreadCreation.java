class MyThreadd extends Thread
{
    public void run()
    {
        for (int i = 1; i <= 10; i++)
        {
            System.out.println(Thread.currentThread().getName() + "(Extends Thread) - Count: " + i);
            try{
                Thread.sleep(300);
            }
            catch(InterruptedException e)
            {
                System.out.println("Interrupted!!!");
            }
        }
    }
}

class MyRunnable implements Runnable
{
    public void run()
    {
        for(int i = 1; i <= 10; i++)
        {
            System.out.println(Thread.currentThread().getName() + "(Extends Thread) - Count: " + i);

            try{
                Thread.sleep(300);
            }
            catch(InterruptedException e)
            {
                System.out.println("Interrupted!!!");
            }
        }
    }
}

public class ThreadCreation
{
    public static void main(String[] args)
    {
        MyThreadd t1 = new MyThreadd();
        t1.setName("Thread A");
        t1.start();

        MyThreadd t2 = new MyThreadd();
        t2.setName("Thread B");
        t2.start();

        System.out.println("Main Thread finished starting both threads");
    }
}