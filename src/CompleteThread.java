class MyThread extends Thread
{
    public void run()
    {
        for(int i = 1; i <= 5; i++)
        {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);

            try{
                Thread.sleep(500);
            }
            catch(InterruptedException e)
            {
                System.out.println("Thread Interuppted");
            }
        }
    }
}

public class CompleteThread
{
    public static void main(String[] args)
    {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        thread1.setName("Thread-1");
        thread2.setName("Thread-2");

        thread1.start();
        thread2.start();

        System.out.println("Main Thread Continues doing its own work");
    }
}