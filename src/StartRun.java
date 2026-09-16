class MyThreaddd extends Thread
{
    public void run()
    {
        System.out.println(Thread.currentThread().getName() + "is executing run()");
    }
}

public class StartRun
{
    public static void main(String[] args)
    {
        MyThreaddd t1 = new MyThreaddd();
        MyThreaddd t2 = new MyThreaddd();

        System.out.println("Calling run() Directly");
        t1.run();
        t2.run();

        System.out.println("\n Calling start() Directly");
        t1 = new MyThreaddd();
        t2 = new MyThreaddd();
        t1.start();
        t2.start();
    }
}